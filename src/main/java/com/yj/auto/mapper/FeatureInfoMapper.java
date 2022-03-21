package com.yj.auto.mapper;

import com.yj.auto.entity.FeatureInfo;
import java.util.List;

public interface FeatureInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FeatureInfo record);

    FeatureInfo selectByPrimaryKey(Integer id);

    List<FeatureInfo> selectAll();

    int updateByPrimaryKey(FeatureInfo record);
}