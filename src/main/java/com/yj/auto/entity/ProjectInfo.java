package com.yj.auto.entity;

import java.util.Date;

public class ProjectInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    private Integer proId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.name
     *
     * @mbggenerated
     */
    private String name;

    private String featurePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.git_address
     *
     * @mbggenerated
     */
    private String gitAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.ios_developer
     *
     * @mbggenerated
     */
    private String iosDeveloper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.android_developer
     *
     * @mbggenerated
     */
    private String androidDeveloper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.last_pull_time
     *
     * @mbggenerated
     */
    private Date lastPullTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    private String token;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.id
     *
     * @return the value of project_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.id
     *
     * @param id the value for project_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.name
     *
     * @return the value of project_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.name
     *
     * @param name the value for project_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getFeaturePath() {
        return featurePath;
    }

    public void setFeaturePath(String featurePath) {
        this.featurePath = featurePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.git_address
     *
     * @return the value of project_info.git_address
     *
     * @mbggenerated
     */
    public String getGitAddress() {
        return gitAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.git_address
     *
     * @param gitAddress the value for project_info.git_address
     *
     * @mbggenerated
     */
    public void setGitAddress(String gitAddress) {
        this.gitAddress = gitAddress == null ? null : gitAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.status
     *
     * @return the value of project_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.status
     *
     * @param status the value for project_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.operator
     *
     * @return the value of project_info.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.operator
     *
     * @param operator the value for project_info.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.ios_developer
     *
     * @return the value of project_info.ios_developer
     *
     * @mbggenerated
     */
    public String getIosDeveloper() {
        return iosDeveloper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.ios_developer
     *
     * @param iosDeveloper the value for project_info.ios_developer
     *
     * @mbggenerated
     */
    public void setIosDeveloper(String iosDeveloper) {
        this.iosDeveloper = iosDeveloper == null ? null : iosDeveloper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.android_developer
     *
     * @return the value of project_info.android_developer
     *
     * @mbggenerated
     */
    public String getAndroidDeveloper() {
        return androidDeveloper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.android_developer
     *
     * @param androidDeveloper the value for project_info.android_developer
     *
     * @mbggenerated
     */
    public void setAndroidDeveloper(String androidDeveloper) {
        this.androidDeveloper = androidDeveloper == null ? null : androidDeveloper.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.last_pull_time
     *
     * @return the value of project_info.last_pull_time
     *
     * @mbggenerated
     */
    public Date getLastPullTime() {
        return lastPullTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.last_pull_time
     *
     * @param lastPullTime the value for project_info.last_pull_time
     *
     * @mbggenerated
     */
    public void setLastPullTime(Date lastPullTime) {
        this.lastPullTime = lastPullTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.create_time
     *
     * @return the value of project_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.create_time
     *
     * @param createTime the value for project_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_info.update_time
     *
     * @return the value of project_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_info.update_time
     *
     * @param updateTime the value for project_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}