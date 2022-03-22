package com.yj.auto.mobile.controller;

import com.yj.auto.common.Result;
import com.yj.auto.mobile.dto.AddMobileRequest;
import com.yj.auto.mobile.dto.DeleteMobileRequest;
import com.yj.auto.mobile.dto.FindMobileRequest;
import com.yj.auto.mobile.dto.UpdateMobileRequest;
import com.yj.auto.mobile.service.MobileService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("mobile")
public class MobileController {

    @Resource
    MobileService mobileService;

    @RequestMapping("add")
    public Result addMobile(@RequestBody AddMobileRequest addMobileRequest){
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
        return mobileService.deleteMobile(deleteMobileRequest);
    }



}
