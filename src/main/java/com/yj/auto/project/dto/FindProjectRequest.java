package com.yj.auto.project.dto;

import com.yj.auto.common.PageRequest;
import lombok.Data;

@Data
public class FindProjectRequest extends PageRequest {

    private Integer id;

    private String name;

    private String gitAddress;

    private String desc;

    private String operator;

    private String iosDeveloper;

    private String androidDeveloper;

    private Integer status;

}
