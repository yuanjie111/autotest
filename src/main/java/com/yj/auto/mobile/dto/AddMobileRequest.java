package com.yj.auto.mobile.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddMobileRequest {

    @NotNull(message = "name不能为空")
    private String name;

    @NotNull(message = "brand不能为空")
    private String brand;

    @NotNull(message = "platform不能为空")
    private String platform;

    @NotNull(message = "osVersion不能为空")
    private String osVersion;

    private String screenSize;

    private String deviceId;

    private String clientId;

    private String udid;
    
    @NotNull(message = "slaveId不能为空")
    private Integer slaveId;

    @NotNull(message = "deviceType不能为空")
    private Integer deviceType;

    private String password;

    private String pictureUrl;

    private String location;
}
