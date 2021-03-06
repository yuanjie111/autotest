package com.yj.auto.mobile.controller;

import com.yj.auto.common.Result;
import com.yj.auto.mobile.dto.*;
import com.yj.auto.mobile.service.MobileService;
import com.yj.auto.project.dto.AddProjectRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("mobile")
public class MobileController {

    @Resource
    MobileService mobileService;

    @RequestMapping("add")
    public Result addMobile(@RequestBody @Valid AddMobileRequest addMobileRequest){
        return mobileService.addMobile(addMobileRequest);
    }

    @RequestMapping("find")
    public Result findMobile(@RequestBody FindMobileRequest findMobileRequest){
        return mobileService.findMobile(findMobileRequest);
    }

    @RequestMapping("update")
    public Result updateMobile(@RequestBody UpdateMobileRequest updateMobileRequest){
        return mobileService.updateMobile(updateMobileRequest);
    }

    @RequestMapping("delete")
    public Result deleteMobile(@RequestBody DeleteMobileRequest deleteMobileRequest){
        return mobileService.offlineMobile(deleteMobileRequest.getId());
    }

    @RequestMapping("upload")
    public Result uploadMobile(@RequestBody UploadMobileRequest uploadMobileRequest){
        return mobileService.uploadMobile(uploadMobileRequest);
    }



}
