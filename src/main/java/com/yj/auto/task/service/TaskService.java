package com.yj.auto.task.service;

import com.yj.auto.common.Result;
import com.yj.auto.mapper.TaskDetailMapper;
import com.yj.auto.task.dto.AddTaskRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaskService {

    @Resource
    TaskDetailMapper taskDetailMapper;

    public Result addTask(AddTaskRequest addTaskRequest){

        return Result.success("添加成功");
    }
}
