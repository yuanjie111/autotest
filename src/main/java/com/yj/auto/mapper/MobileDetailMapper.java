package com.yj.auto.mapper;

import com.yj.auto.entity.MobileDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MobileDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    int insert(MobileDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    int insertSelective(MobileDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    MobileDetail selectByPrimaryKey(Integer id);

    MobileDetail selectByDeviceId(@Param("deviceId") String deviceId);

    List<MobileDetail> selective(@Param("record") MobileDetail record, @Param("limit") Integer limit, @Param("offset") Integer offset);

    Long selectMobileCount(@Param("record") MobileDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MobileDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MobileDetail record);

    int updateByDevices(@Param("devices") List<String> devices);
}