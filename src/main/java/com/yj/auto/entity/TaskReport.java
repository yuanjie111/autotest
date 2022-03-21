package com.yj.auto.entity;

import java.util.Date;

public class TaskReport {
    private Integer id;

    private Integer taskId;

    private Integer triggerId;

    private String testPackage;

    private Integer featuresNum;

    private Integer featureFassedNum;

    private Integer featureFailedNum;

    private Integer scenariosNum;

    private Integer scenarioPassedNum;

    private Integer scenarioFailedNum;

    private Integer stepsNum;

    private Integer stepPassedNum;

    private Integer stepSkippedNum;

    private Integer stepFailedNum;

    private String casePassRate;

    private String featurePassRate;

    private String operator;

    private String elapsedTime;

    private Date executeTime;

    private Date executeEndTime;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public String getTestPackage() {
        return testPackage;
    }

    public void setTestPackage(String testPackage) {
        this.testPackage = testPackage == null ? null : testPackage.trim();
    }

    public Integer getFeaturesNum() {
        return featuresNum;
    }

    public void setFeaturesNum(Integer featuresNum) {
        this.featuresNum = featuresNum;
    }

    public Integer getFeatureFassedNum() {
        return featureFassedNum;
    }

    public void setFeatureFassedNum(Integer featureFassedNum) {
        this.featureFassedNum = featureFassedNum;
    }

    public Integer getFeatureFailedNum() {
        return featureFailedNum;
    }

    public void setFeatureFailedNum(Integer featureFailedNum) {
        this.featureFailedNum = featureFailedNum;
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

    public String getCasePassRate() {
        return casePassRate;
    }

    public void setCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate == null ? null : casePassRate.trim();
    }

    public String getFeaturePassRate() {
        return featurePassRate;
    }

    public void setFeaturePassRate(String featurePassRate) {
        this.featurePassRate = featurePassRate == null ? null : featurePassRate.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime == null ? null : elapsedTime.trim();
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public Date getExecuteEndTime() {
        return executeEndTime;
    }

    public void setExecuteEndTime(Date executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}