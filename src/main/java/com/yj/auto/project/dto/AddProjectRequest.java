package com.yj.auto.project.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddProjectRequest {

    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "gitAddress不能为空")
    private String gitAddress;

    private String describe;

    private String operator;

    private String iosDeveloper;

    private String androidDeveloper;

}
