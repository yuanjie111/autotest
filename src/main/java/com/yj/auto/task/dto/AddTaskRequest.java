package com.yj.auto.task.dto;

import lombok.Data;

@Data
public class AddTaskRequest {

    private String name;
    private String testPackage;
    private Integer buildType;
    private Integer runType;
    private Integer mobilePlatform;
    private String deviceInfo;
    private String caseTag;
    private String reportRecipients;
    private String expression;
    private String operator;

}
