package com.yj.auto.project.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.enums.StatusEnum;
import com.yj.auto.entity.ProjectInfo;
import com.yj.auto.mapper.ProjectInfoMapper;
import com.yj.auto.project.dto.AddProjectRequest;
import com.yj.auto.project.dto.FindProjectRequest;
import com.yj.auto.project.dto.ProjectTreeResult;
import com.yj.auto.project.dto.UpdateProjectRequest;
import com.yj.auto.util.HttpUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectService {

    @Resource
    ProjectInfoMapper projectInfoMapper;
    @Resource
    HttpUtil httpUtil;

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

    public Result getFeatures(){
        String url = "%s/api/v4/projects/%s/repository/tree";
        List<ProjectInfo> projectInfos = projectInfoMapper.selectByStatus(StatusEnum.INVALID.getCode());
        for(ProjectInfo projectInfo:projectInfos){
            String gitUrl = String.format(url, projectInfo.getGitAddress(), projectInfo.getProId());
            Map<String,String> params = new HashMap<>();
            String path = projectInfo.getFeaturePath() != null && projectInfo.getFeaturePath() != "" ? projectInfo.getFeaturePath():"src/main/java/features";
            params.put("path",path);
            Map<String,String> headers = new HashMap<>();
            headers.put("PRIVATE-TOKEN",projectInfo.getToken());
            String result = httpUtil.httpGet(gitUrl, params, headers);
            JSONArray objects = JSONArray.parseArray(result);
            for(int i=0;i <objects.size();i++){
                objects.getJSONObject(i).getString("type");
            }
        }
        return Result.success("feature获取成功");
    }
}
