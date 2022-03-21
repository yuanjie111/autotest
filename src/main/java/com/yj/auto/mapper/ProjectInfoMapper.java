package com.yj.auto.mapper;

import com.yj.auto.entity.ProjectInfo;
import java.util.List;

public interface ProjectInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectInfo record);

    ProjectInfo selectByPrimaryKey(Integer id);

    List<ProjectInfo> selectAll();

    int updateByPrimaryKey(ProjectInfo record);
}