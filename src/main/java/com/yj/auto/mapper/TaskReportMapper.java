package com.yj.auto.mapper;

import com.yj.auto.entity.TaskReport;

public interface TaskReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    int insert(TaskReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    int insertSelective(TaskReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    TaskReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TaskReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_report
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TaskReport record);
}