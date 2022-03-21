package com.yj.auto.mapper;

import com.yj.auto.entity.TaskReport;
import java.util.List;

public interface TaskReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskReport record);

    TaskReport selectByPrimaryKey(Integer id);

    List<TaskReport> selectAll();

    int updateByPrimaryKey(TaskReport record);
}