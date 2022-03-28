package com.yj.auto.project.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;
import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.FeatureInfo;
import com.yj.auto.enums.StatusEnum;
import com.yj.auto.entity.ProjectInfo;
import com.yj.auto.mapper.FeatureInfoMapper;
import com.yj.auto.mapper.ProjectInfoMapper;
import com.yj.auto.project.dto.*;
import com.yj.auto.util.HttpUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Resource
    ProjectInfoMapper projectInfoMapper;
    @Resource
    HttpUtil httpUtil;
    @Resource
    FeatureInfoMapper featureInfoMapper;

    public Result addProject(AddProjectRequest addProjectRequest) {
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(addProjectRequest, projectInfo);
        int result = projectInfoMapper.insertSelective(projectInfo);
        Assert.isTrue(result > 0, "添加失败");
        return Result.success("添加成功");
    }

    public Result findProject(FindProjectRequest findProjectRequest) {
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(findProjectRequest, projectInfo);
        Long total = projectInfoMapper.selectProjectCount(projectInfo);
        List<ProjectInfo> projectInfos = projectInfoMapper.selective(projectInfo, findProjectRequest.getPageSize(),
                (findProjectRequest.getPageNum() - 1) * findProjectRequest.getPageSize());
        PageResult<ProjectInfo> projectInfosResult = PageResult.buildResult(projectInfos, total, findProjectRequest.getPageNum(), findProjectRequest.getPageSize());
        return Result.success(projectInfosResult);
    }

    public Result updateProject(UpdateProjectRequest updateProjectRequest) {
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(updateProjectRequest, projectInfo);
        projectInfo.setUpdateTime(new Date());
        int result = projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
        Assert.isTrue(result > 0, "修改失败");
        return Result.success("修改成功");
    }

    public Result deleteProject(Integer id) {
        ProjectInfo projectInfo = projectInfoMapper.selectByPrimaryKey(id);
        if (projectInfo != null) {
            projectInfo.setStatus(0);
            projectInfo.setUpdateTime(new Date());
            int result = projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
            Assert.isTrue(result > 0, "删除失败");
            return Result.success("删除失败");
        }
        return Result.error("300", "不存在该记录");
    }

    public Result getFeatures() {
        List<FeatureInfo> features = new ArrayList<>();
        String url = "%s/api/v4/projects/%s/repository/tree";
        List<ProjectInfo> projectInfos = projectInfoMapper.selectByStatus(StatusEnum.INVALID.getCode());
        for (ProjectInfo projectInfo : projectInfos) {
            String gitUrl = String.format(url, projectInfo.getGitAddress(), projectInfo.getProId());
            Map<String, String> params = new HashMap<>();
            String path = projectInfo.getFeaturePath() != null && projectInfo.getFeaturePath() != "" ? projectInfo.getFeaturePath() : "src/main/java/features";
            params.put("path", path);
            Map<String, String> headers = new HashMap<>();
            headers.put("PRIVATE-TOKEN", projectInfo.getToken());
            getProjectTree(gitUrl, path, headers, features, projectInfo);
            features.forEach(featureInfo -> {
                FeatureInfo feature = featureInfoMapper.selectByNameAndProjectId(featureInfo.getName(), featureInfo.getProjectId());
                if(feature !=null){
                    featureInfo.setUpdateTime(new Date());
                    featureInfoMapper.updateByPrimaryKeySelective(featureInfo);
                }else{
                    featureInfoMapper.insert(featureInfo);
                }
            });
            List<String> featureNames = features.stream().map(FeatureInfo::getName).collect(Collectors.toList());
            List<FeatureInfo> featureInfos = featureInfoMapper.selectByNamesAndProjectId(featureNames, projectInfo.getId());
            List<Integer> featureIds = featureInfos.stream().map(FeatureInfo::getId).collect(Collectors.toList());
            if(featureIds.size()>0){
                featureInfoMapper.deleteByIds(featureIds);
            }
        }
        return Result.success("feature获取成功");
    }

    private void getProjectTree(String url, String path, Map<String, String> headers, List<FeatureInfo> features, ProjectInfo project) {
        String result;
        Map<String, String> params = new HashMap<>();
        params.put("path", path);
        result = httpUtil.httpGet(url, params, headers);
        List<ProjectTreeInfo> projectTreeInfoList = JSONArray.parseObject(result, new TypeReference<List<ProjectTreeInfo>>() {
        });
        projectTreeInfoList.forEach(projectTreeInfo -> {
            if (projectTreeInfo.getType().equals("tree")) {
                getProjectTree(url, path + "/" + projectTreeInfo.getName(), headers, features, project);
            } else {
                if (projectTreeInfo.getName().contains(".feature")) {
                    FeatureInfo featureInfo = new FeatureInfo();
                    featureInfo.setProjectId(project.getId());
                    featureInfo.setName(projectTreeInfo.getName());
                    featureInfo.setSmoke(projectTreeInfo.getName().contains("smoke")?1:0);
                    featureInfo.setStatus(1);
                    featureInfo.setOperator(project.getOperator());
                    features.add(featureInfo);
                }
            }
        });
    }
}
