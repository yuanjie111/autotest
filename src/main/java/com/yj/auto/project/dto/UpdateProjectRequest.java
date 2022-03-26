package com.yj.auto.project.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateProjectRequest {
    private Integer id;

    private String name;

    private String gitAddress;

    private String desc;

    private String operator;

    private String iosDeveloper;

    private String androidDeveloper;

    private Integer status;

    private Date lastPullTime;
}
