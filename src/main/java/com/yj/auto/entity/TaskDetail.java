package com.yj.auto.entity;

import java.util.Date;

public class TaskDetail {
    private Integer id;

    private String name;

    private String testPackage;

    private Integer buildType;

    private Integer taskType;

    private Integer runType;

    private Integer jobRunType;

    private Integer mobilePlatform;

    private String deviceInfo;

    private String executeTime;

    private Date executeEndTime;

    private String caseTag;

    private String reportRecipients;

    private Integer status;

    private String triggerurl;

    private String expression;

    private String operator;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTestPackage() {
        return testPackage;
    }

    public void setTestPackage(String testPackage) {
        this.testPackage = testPackage == null ? null : testPackage.trim();
    }

    public Integer getBuildType() {
        return buildType;
    }

    public void setBuildType(Integer buildType) {
        this.buildType = buildType;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getRunType() {
        return runType;
    }

    public void setRunType(Integer runType) {
        this.runType = runType;
    }

    public Integer getJobRunType() {
        return jobRunType;
    }

    public void setJobRunType(Integer jobRunType) {
        this.jobRunType = jobRunType;
    }

    public Integer getMobilePlatform() {
        return mobilePlatform;
    }

    public void setMobilePlatform(Integer mobilePlatform) {
        this.mobilePlatform = mobilePlatform;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime == null ? null : executeTime.trim();
    }

    public Date getExecuteEndTime() {
        return executeEndTime;
    }

    public void setExecuteEndTime(Date executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    public String getCaseTag() {
        return caseTag;
    }

    public void setCaseTag(String caseTag) {
        this.caseTag = caseTag == null ? null : caseTag.trim();
    }

    public String getReportRecipients() {
        return reportRecipients;
    }

    public void setReportRecipients(String reportRecipients) {
        this.reportRecipients = reportRecipients == null ? null : reportRecipients.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTriggerurl() {
        return triggerurl;
    }

    public void setTriggerurl(String triggerurl) {
        this.triggerurl = triggerurl == null ? null : triggerurl.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}