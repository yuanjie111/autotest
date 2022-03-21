package com.yj.auto.mapper;

import com.yj.auto.entity.MobileDetail;
import java.util.List;

public interface MobileDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileDetail record);

    MobileDetail selectByPrimaryKey(Integer id);

    List<MobileDetail> selectAll();

    int updateByPrimaryKey(MobileDetail record);
}