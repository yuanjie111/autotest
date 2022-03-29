package com.yj.auto.entity;

import java.util.Date;

public class TaskRunInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.task_id
     *
     * @mbggenerated
     */
    private String taskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.feature_id
     *
     * @mbggenerated
     */
    private Integer featureId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.execute_status
     *
     * @mbggenerated
     */
    private Integer executeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.mobile_id
     *
     * @mbggenerated
     */
    private Integer mobileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.platform
     *
     * @mbggenerated
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.pass_rate
     *
     * @mbggenerated
     */
    private String passRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.scenarios_num
     *
     * @mbggenerated
     */
    private Integer scenariosNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.scenario_passed_num
     *
     * @mbggenerated
     */
    private Integer scenarioPassedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.scenario_failed_num
     *
     * @mbggenerated
     */
    private Integer scenarioFailedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.steps_num
     *
     * @mbggenerated
     */
    private Integer stepsNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.step_passed_num
     *
     * @mbggenerated
     */
    private Integer stepPassedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.step_skipped_num
     *
     * @mbggenerated
     */
    private Integer stepSkippedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.step_failed_num
     *
     * @mbggenerated
     */
    private Integer stepFailedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.report_path
     *
     * @mbggenerated
     */
    private String reportPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.elapsed_time
     *
     * @mbggenerated
     */
    private String elapsedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.jenkins_job_name
     *
     * @mbggenerated
     */
    private String jenkinsJobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.jenkins_build_number
     *
     * @mbggenerated
     */
    private Integer jenkinsBuildNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.execute_starttime
     *
     * @mbggenerated
     */
    private Date executeStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.execute_end_time
     *
     * @mbggenerated
     */
    private Date executeEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.is_retry_at_end
     *
     * @mbggenerated
     */
    private Integer isRetryAtEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.retryT_times
     *
     * @mbggenerated
     */
    private Integer retryTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.html_report_name
     *
     * @mbggenerated
     */
    private String htmlReportName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.status
     *
     * @mbggenerated
     */
    private Integer status;
    private Integer runResult;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_run_info.trigger_id
     *
     * @mbggenerated
     */
    private Integer triggerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.id
     *
     * @return the value of task_run_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.id
     *
     * @param id the value for task_run_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.task_id
     *
     * @return the value of task_run_info.task_id
     *
     * @mbggenerated
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.task_id
     *
     * @param taskId the value for task_run_info.task_id
     *
     * @mbggenerated
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.feature_id
     *
     * @return the value of task_run_info.feature_id
     *
     * @mbggenerated
     */
    public Integer getFeatureId() {
        return featureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.feature_id
     *
     * @param featureId the value for task_run_info.feature_id
     *
     * @mbggenerated
     */
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.execute_status
     *
     * @return the value of task_run_info.execute_status
     *
     * @mbggenerated
     */
    public Integer getExecuteStatus() {
        return executeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.execute_status
     *
     * @param executeStatus the value for task_run_info.execute_status
     *
     * @mbggenerated
     */
    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.mobile_id
     *
     * @return the value of task_run_info.mobile_id
     *
     * @mbggenerated
     */
    public Integer getMobileId() {
        return mobileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.mobile_id
     *
     * @param mobileId the value for task_run_info.mobile_id
     *
     * @mbggenerated
     */
    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.platform
     *
     * @return the value of task_run_info.platform
     *
     * @mbggenerated
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.platform
     *
     * @param platform the value for task_run_info.platform
     *
     * @mbggenerated
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.pass_rate
     *
     * @return the value of task_run_info.pass_rate
     *
     * @mbggenerated
     */
    public String getPassRate() {
        return passRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.pass_rate
     *
     * @param passRate the value for task_run_info.pass_rate
     *
     * @mbggenerated
     */
    public void setPassRate(String passRate) {
        this.passRate = passRate == null ? null : passRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.scenarios_num
     *
     * @return the value of task_run_info.scenarios_num
     *
     * @mbggenerated
     */
    public Integer getScenariosNum() {
        return scenariosNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.scenarios_num
     *
     * @param scenariosNum the value for task_run_info.scenarios_num
     *
     * @mbggenerated
     */
    public void setScenariosNum(Integer scenariosNum) {
        this.scenariosNum = scenariosNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.scenario_passed_num
     *
     * @return the value of task_run_info.scenario_passed_num
     *
     * @mbggenerated
     */
    public Integer getScenarioPassedNum() {
        return scenarioPassedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.scenario_passed_num
     *
     * @param scenarioPassedNum the value for task_run_info.scenario_passed_num
     *
     * @mbggenerated
     */
    public void setScenarioPassedNum(Integer scenarioPassedNum) {
        this.scenarioPassedNum = scenarioPassedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.scenario_failed_num
     *
     * @return the value of task_run_info.scenario_failed_num
     *
     * @mbggenerated
     */
    public Integer getScenarioFailedNum() {
        return scenarioFailedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.scenario_failed_num
     *
     * @param scenarioFailedNum the value for task_run_info.scenario_failed_num
     *
     * @mbggenerated
     */
    public void setScenarioFailedNum(Integer scenarioFailedNum) {
        this.scenarioFailedNum = scenarioFailedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.steps_num
     *
     * @return the value of task_run_info.steps_num
     *
     * @mbggenerated
     */
    public Integer getStepsNum() {
        return stepsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.steps_num
     *
     * @param stepsNum the value for task_run_info.steps_num
     *
     * @mbggenerated
     */
    public void setStepsNum(Integer stepsNum) {
        this.stepsNum = stepsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.step_passed_num
     *
     * @return the value of task_run_info.step_passed_num
     *
     * @mbggenerated
     */
    public Integer getStepPassedNum() {
        return stepPassedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.step_passed_num
     *
     * @param stepPassedNum the value for task_run_info.step_passed_num
     *
     * @mbggenerated
     */
    public void setStepPassedNum(Integer stepPassedNum) {
        this.stepPassedNum = stepPassedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.step_skipped_num
     *
     * @return the value of task_run_info.step_skipped_num
     *
     * @mbggenerated
     */
    public Integer getStepSkippedNum() {
        return stepSkippedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.step_skipped_num
     *
     * @param stepSkippedNum the value for task_run_info.step_skipped_num
     *
     * @mbggenerated
     */
    public void setStepSkippedNum(Integer stepSkippedNum) {
        this.stepSkippedNum = stepSkippedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.step_failed_num
     *
     * @return the value of task_run_info.step_failed_num
     *
     * @mbggenerated
     */
    public Integer getStepFailedNum() {
        return stepFailedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.step_failed_num
     *
     * @param stepFailedNum the value for task_run_info.step_failed_num
     *
     * @mbggenerated
     */
    public void setStepFailedNum(Integer stepFailedNum) {
        this.stepFailedNum = stepFailedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.report_path
     *
     * @return the value of task_run_info.report_path
     *
     * @mbggenerated
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.report_path
     *
     * @param reportPath the value for task_run_info.report_path
     *
     * @mbggenerated
     */
    public void setReportPath(String reportPath) {
        this.reportPath = reportPath == null ? null : reportPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.elapsed_time
     *
     * @return the value of task_run_info.elapsed_time
     *
     * @mbggenerated
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.elapsed_time
     *
     * @param elapsedTime the value for task_run_info.elapsed_time
     *
     * @mbggenerated
     */
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime == null ? null : elapsedTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.jenkins_job_name
     *
     * @return the value of task_run_info.jenkins_job_name
     *
     * @mbggenerated
     */
    public String getJenkinsJobName() {
        return jenkinsJobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.jenkins_job_name
     *
     * @param jenkinsJobName the value for task_run_info.jenkins_job_name
     *
     * @mbggenerated
     */
    public void setJenkinsJobName(String jenkinsJobName) {
        this.jenkinsJobName = jenkinsJobName == null ? null : jenkinsJobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.jenkins_build_number
     *
     * @return the value of task_run_info.jenkins_build_number
     *
     * @mbggenerated
     */
    public Integer getJenkinsBuildNumber() {
        return jenkinsBuildNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.jenkins_build_number
     *
     * @param jenkinsBuildNumber the value for task_run_info.jenkins_build_number
     *
     * @mbggenerated
     */
    public void setJenkinsBuildNumber(Integer jenkinsBuildNumber) {
        this.jenkinsBuildNumber = jenkinsBuildNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.execute_starttime
     *
     * @return the value of task_run_info.execute_starttime
     *
     * @mbggenerated
     */
    public Date getExecuteStartTime() {
        return executeStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.execute_starttime
     *
     * @param executeStarttime the value for task_run_info.execute_starttime
     *
     * @mbggenerated
     */
    public void setExecuteStartTime(Date executeStarttime) {
        this.executeStartTime = executeStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.execute_end_time
     *
     * @return the value of task_run_info.execute_end_time
     *
     * @mbggenerated
     */
    public Date getExecuteEndTime() {
        return executeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.execute_end_time
     *
     * @param executeEndTime the value for task_run_info.execute_end_time
     *
     * @mbggenerated
     */
    public void setExecuteEndTime(Date executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.is_retry_at_end
     *
     * @return the value of task_run_info.is_retry_at_end
     *
     * @mbggenerated
     */
    public Integer getIsRetryAtEnd() {
        return isRetryAtEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.is_retry_at_end
     *
     * @param isRetryAtEnd the value for task_run_info.is_retry_at_end
     *
     * @mbggenerated
     */
    public void setIsRetryAtEnd(Integer isRetryAtEnd) {
        this.isRetryAtEnd = isRetryAtEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.retryT_times
     *
     * @return the value of task_run_info.retryT_times
     *
     * @mbggenerated
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.retryT_times
     *
     * @param retrytTimes the value for task_run_info.retryT_times
     *
     * @mbggenerated
     */
    public void setRetryTimes(Integer retrytTimes) {
        this.retryTimes = retrytTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.html_report_name
     *
     * @return the value of task_run_info.html_report_name
     *
     * @mbggenerated
     */
    public String getHtmlReportName() {
        return htmlReportName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.html_report_name
     *
     * @param htmlReportName the value for task_run_info.html_report_name
     *
     * @mbggenerated
     */
    public void setHtmlReportName(String htmlReportName) {
        this.htmlReportName = htmlReportName == null ? null : htmlReportName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.status
     *
     * @return the value of task_run_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.status
     *
     * @param status the value for task_run_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.operator
     *
     * @return the value of task_run_info.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.operator
     *
     * @param operator the value for task_run_info.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.create_time
     *
     * @return the value of task_run_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.create_time
     *
     * @param createTime the value for task_run_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.update_time
     *
     * @return the value of task_run_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.update_time
     *
     * @param updateTime the value for task_run_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_run_info.trigger_id
     *
     * @return the value of task_run_info.trigger_id
     *
     * @mbggenerated
     */
    public Integer getTriggerId() {
        return triggerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_run_info.trigger_id
     *
     * @param triggerId the value for task_run_info.trigger_id
     *
     * @mbggenerated
     */
    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public Integer getRunResult() {
        return runResult;
    }

    public void setRunResult(Integer runResult) {
        this.runResult = runResult;
    }
}