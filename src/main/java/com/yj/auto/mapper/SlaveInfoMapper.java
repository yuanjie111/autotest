package com.yj.auto.mapper;

import com.yj.auto.entity.SlaveInfo;
import java.util.List;

public interface SlaveInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SlaveInfo record);

    SlaveInfo selectByPrimaryKey(Long id);

    List<SlaveInfo> selectAll();

    int updateByPrimaryKey(SlaveInfo record);
}