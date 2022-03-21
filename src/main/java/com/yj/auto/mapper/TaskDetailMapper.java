package com.yj.auto.mapper;

import com.yj.auto.entity.TaskDetail;
import java.util.List;

public interface TaskDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskDetail record);

    TaskDetail selectByPrimaryKey(Integer id);

    List<TaskDetail> selectAll();

    int updateByPrimaryKey(TaskDetail record);
}