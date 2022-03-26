package com.yj.auto.mobile.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Data
public class UploadMobileRequest {

    @Resource
    List<AddMobileRequest> mobileList;
}
