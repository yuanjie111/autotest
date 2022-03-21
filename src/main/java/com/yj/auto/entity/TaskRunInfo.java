package com.yj.auto.entity;

import java.util.Date;

public class TaskRunInfo {
    private Integer id;

    private String taskId;

    private Integer featureId;

    private Integer executeStatus;

    private Integer mobileId;

    private Integer platform;

    private String passRate;

    private Integer scenariosNum;

    private Integer scenarioPassedNum;

    private Integer scenarioFailedNum;

    private Integer stepsNum;

    private Integer stepPassedNum;

    private Integer stepSkippedNum;

    private Integer stepFailedNum;

    private String reportPath;

    private String elapsedTime;

    private String jenkinsJobName;

    private Integer jenkinsBuildNumber;

    private Date executeStarttime;

    private Date executeEndTime;

    private Integer isRetryAtEnd;

    private Integer retrytTimes;

    private String htmlReportName;

    private Integer status;

    private String operator;

    private Date createTime;

    private Date updateTime;

    private Integer triggerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public Integer getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate == null ? null : passRate.trim();
    }

    public Integer getScenariosNum() {
        return scenariosNum;
    }

    public void setScenariosNum(Integer scenariosNum) {
        this.scenariosNum = scenariosNum;
    }

    public Integer getScenarioPassedNum() {
        return scenarioPassedNum;
    }

    public void setScenarioPassedNum(Integer scenarioPassedNum) {
        this.scenarioPassedNum = scenarioPassedNum;
    }

    public Integer getScenarioFailedNum() {
        return scenarioFailedNum;
    }

    public void setScenarioFailedNum(Integer scenarioFailedNum) {
        this.scenarioFailedNum = scenarioFailedNum;
    }

    public Integer getStepsNum() {
        return stepsNum;
    }

    public void setStepsNum(Integer stepsNum) {
        this.stepsNum = stepsNum;
    }

    public Integer getStepPassedNum() {
        return stepPassedNum;
    }

    public void setStepPassedNum(Integer stepPassedNum) {
        this.stepPassedNum = stepPassedNum;
    }

    public Integer getStepSkippedNum() {
        return stepSkippedNum;
    }

    public void setStepSkippedNum(Integer stepSkippedNum) {
        this.stepSkippedNum = stepSkippedNum;
    }

    public Integer getStepFailedNum() {
        return stepFailedNum;
    }

    public void setStepFailedNum(Integer stepFailedNum) {
        this.stepFailedNum = stepFailedNum;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath == null ? null : reportPath.trim();
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime == null ? null : elapsedTime.trim();
    }

    public String getJenkinsJobName() {
        return jenkinsJobName;
    }

    public void setJenkinsJobName(String jenkinsJobName) {
        this.jenkinsJobName = jenkinsJobName == null ? null : jenkinsJobName.trim();
    }

    public Integer getJenkinsBuildNumber() {
        return jenkinsBuildNumber;
    }

    public void setJenkinsBuildNumber(Integer jenkinsBuildNumber) {
        this.jenkinsBuildNumber = jenkinsBuildNumber;
    }

    public Date getExecuteStarttime() {
        return executeStarttime;
    }

    public void setExecuteStarttime(Date executeStarttime) {
        this.executeStarttime = executeStarttime;
    }

    public Date getExecuteEndTime() {
        return executeEndTime;
    }

    public void setExecuteEndTime(Date executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    public Integer getIsRetryAtEnd() {
        return isRetryAtEnd;
    }

    public void setIsRetryAtEnd(Integer isRetryAtEnd) {
        this.isRetryAtEnd = isRetryAtEnd;
    }

    public Integer getRetrytTimes() {
        return retrytTimes;
    }

    public void setRetrytTimes(Integer retrytTimes) {
        this.retrytTimes = retrytTimes;
    }

    public String getHtmlReportName() {
        return htmlReportName;
    }

    public void setHtmlReportName(String htmlReportName) {
        this.htmlReportName = htmlReportName == null ? null : htmlReportName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }
}