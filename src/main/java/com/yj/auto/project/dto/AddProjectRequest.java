package com.yj.auto.project.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddProjectRequest {

    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "gitAddress不能为空")
    private String gitAddress;

    private String desc;

    @NotNull(message = "token不能为空")
    private String token;

    @NotNull(message = "proId不能为空")
    private Integer proId;

    private Integer featurePath;

    private String operator;

    private String iosDeveloper;

    private String androidDeveloper;

}
