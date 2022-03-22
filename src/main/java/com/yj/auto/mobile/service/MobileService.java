package com.yj.auto.mobile.service;

import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.MobileDetail;
import com.yj.auto.mapper.MobileDetailMapper;
import com.yj.auto.mobile.dto.FindMobileRequest;
import com.yj.auto.mobile.dto.AddMobileRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MobileService {
    @Resource
    MobileDetailMapper mobileDetailMapper;

//    查找手机
    public Result findMobile(FindMobileRequest findMobileRequest) {
        MobileDetail mobile = new MobileDetail();
        BeanUtils.copyProperties(findMobileRequest, mobile);
        Long total = mobileDetailMapper.selectMobileCount(mobile);
        List<MobileDetail> mobiles = mobileDetailMapper.selective(mobile, findMobileRequest.getPageSize(),
                (findMobileRequest.getPageNum() - 1) * findMobileRequest.getPageSize());
        PageResult<MobileDetail> mobileResult = PageResult.buildResult(mobiles, total, findMobileRequest.getPageNum(), findMobileRequest.getPageSize());
        return Result.success(mobileResult);
    }

//    添加手机
    public Result addMobile(AddMobileRequest addMobileRequest){
        MobileDetail mobileDetail = new MobileDetail();
        BeanUtils.copyProperties(addMobileRequest,mobileDetail);
        int result = mobileDetailMapper.insertSelective(mobileDetail);
        Assert.isTrue(result>0,"添加失败");
        return Result.success("添加成功");
    }

}
