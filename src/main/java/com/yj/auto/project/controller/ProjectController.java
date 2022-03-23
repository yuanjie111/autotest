package com.yj.auto.project.controller;

import com.yj.auto.common.Result;
import com.yj.auto.project.dto.AddProjectRequest;
import com.yj.auto.project.dto.DeleteProjectRequest;
import com.yj.auto.project.dto.FindProjectRequest;
import com.yj.auto.project.dto.UpdateProjectRequest;
import com.yj.auto.project.service.ProjectService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Resource
    ProjectService projectService;

    @RequestMapping("add")
    public Result addProject(@RequestBody AddProjectRequest addProjectRequest){
        return projectService.addProject(addProjectRequest);
    }

    @RequestMapping("update")
    public Result updateProject(@RequestBody UpdateProjectRequest updateProjectRequest){
        return projectService.updateProject(updateProjectRequest);
    }

    @RequestMapping("find")
    public Result findProject(@RequestBody FindProjectRequest findProjectRequest){
        return projectService.findProject(findProjectRequest);
    }

    @RequestMapping("delete")
    public Result deleteProject(@RequestBody DeleteProjectRequest deleteProjectRequest){
        return projectService.deleteProject(deleteProjectRequest.getId());
    }
}
