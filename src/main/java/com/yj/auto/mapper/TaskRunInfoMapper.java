package com.yj.auto.mapper;

import com.yj.auto.entity.TaskRunInfo;
import java.util.List;

public interface TaskRunInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskRunInfo record);

    TaskRunInfo selectByPrimaryKey(Integer id);

    List<TaskRunInfo> selectAll();

    int updateByPrimaryKey(TaskRunInfo record);
}