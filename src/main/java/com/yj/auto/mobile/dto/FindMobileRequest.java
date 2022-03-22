package com.yj.auto.mobile.dto;

import com.yj.auto.common.PageRequest;
import lombok.Data;

@Data
public class FindMobileRequest extends PageRequest {

    private Integer id;

    private String name;

    private String brand;

    private String platform;

    private String osVersion;

    private String screenSize;

    private String deviceId;

    private String clientId;

    private String udid;

    private Integer slaveId;

    private Integer status ;

    private Integer readyState = 1;

    private Integer deviceType;
}
