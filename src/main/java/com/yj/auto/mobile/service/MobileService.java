package com.yj.auto.mobile.service;

import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.MobileDetail;
import com.yj.auto.mapper.MobileDetailMapper;
import com.yj.auto.mobile.dto.DeleteMobileRequest;
import com.yj.auto.mobile.dto.FindMobileRequest;
import com.yj.auto.mobile.dto.AddMobileRequest;
import com.yj.auto.mobile.dto.UpdateMobileRequest;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
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

    //修改手机
    public Result updateMobile(UpdateMobileRequest updateMobileRequest){
        MobileDetail mobileDetail = new MobileDetail();
        BeanUtils.copyProperties(updateMobileRequest,mobileDetail);
        int result = mobileDetailMapper.updateByPrimaryKeySelective(mobileDetail);
        Assert.isTrue(result > 0,"修改失败");
        return Result.success("修改成功");
    }

    //下线手机
    public Result offlineMobile(Integer id){
        MobileDetail mobile = mobileDetailMapper.selectByPrimaryKey(id);
        if(mobile != null){
            if(mobile.getStatus() == 1){
                mobile.setHeartbeatLastTime(new Date());
            }
            mobile.setReadyState(2);
            int result = mobileDetailMapper.updateByPrimaryKeySelective(mobile);
            Assert.isTrue(result > 0,"删除失败");
            return Result.success("删除成功");
        }
        return Result.error("300","不存在该数据");
    }

}
