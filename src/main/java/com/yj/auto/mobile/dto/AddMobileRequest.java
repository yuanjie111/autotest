package com.yj.auto.mobile.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddMobileRequest {

    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "brand不能为空")
    private String brand;
    @NotNull
    private String platform;
    @NotNull
    private String osVersion;

    private String screenSize;

    private String deviceId;

    private String clientId;

    private String udid;
    @NotNull
    private Integer slaveId;

    @NotNull
    private Integer deviceType;

    private String password;

    private String pictureUrl;

    private String location;
}
