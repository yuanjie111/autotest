package com.yj.auto.project.service;

import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.ProjectInfo;
import com.yj.auto.mapper.ProjectInfoMapper;
import com.yj.auto.project.dto.AddProjectRequest;
import com.yj.auto.project.dto.FindProjectRequest;
import com.yj.auto.project.dto.UpdateProjectRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ProjectService {

    @Resource
    ProjectInfoMapper projectInfoMapper;

    public Result addProject(AddProjectRequest addProjectRequest) {
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(projectInfo, addProjectRequest);
        int result = projectInfoMapper.insertSelective(projectInfo);
        Assert.isTrue(result > 0, "添加失败");
        return Result.success("添加成功");
    }

    public Result findProject(FindProjectRequest findProjectRequest) {
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(projectInfo, findProjectRequest);
        Long total = projectInfoMapper.selectProjectCount(projectInfo);
        List<ProjectInfo> projectInfos = projectInfoMapper.selective(projectInfo, findProjectRequest.getPageSize(),
                (findProjectRequest.getPageNum() - 1) * findProjectRequest.getPageSize());
        PageResult<ProjectInfo> projectInfosResult = PageResult.buildResult(projectInfos, total, findProjectRequest.getPageNum(), findProjectRequest.getPageSize());
        return Result.success(projectInfosResult);
    }

    public Result updateProject(UpdateProjectRequest updateProjectRequest){
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(projectInfo, updateProjectRequest);
        projectInfo.setUpdateTime(new Date());
        int result = projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
        Assert.isTrue(result > 0, "修改失败");
        return Result.success("修改成功");
    }

    public Result deleteProject(Integer id){
        ProjectInfo projectInfo = projectInfoMapper.selectByPrimaryKey(id);
        if(projectInfo != null){
            projectInfo.setStatus(0);
            projectInfo.setUpdateTime(new Date());
            int result = projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
            Assert.isTrue(result > 0,"删除失败");
            return Result.success("删除失败");
        }
        return Result.error("300","不存在该记录");
    }
}
