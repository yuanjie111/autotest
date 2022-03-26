package com.yj.auto.mobile.service;

import com.sun.deploy.ui.DialogTemplate;
import com.yj.auto.common.PageResult;
import com.yj.auto.common.Result;
import com.yj.auto.entity.MobileDetail;
import com.yj.auto.exceptions.ServiceException;
import com.yj.auto.mapper.MobileDetailMapper;
import com.yj.auto.mobile.dto.*;
import com.yj.auto.project.dto.AddProjectRequest;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    //上报在线手机
    public Result uploadMobile(UploadMobileRequest uploadMobileRequest) {
        List<AddMobileRequest> addMobileRequestList = uploadMobileRequest.getMobileList();
        List<String> devices = new ArrayList<>();
        try{
            for(AddMobileRequest mobile:addMobileRequestList){
                //查询数据库是否存在该手机
                MobileDetail mobileDetail = mobileDetailMapper.selectByDeviceId(mobile.getDeviceId());
                devices.add(mobile.getDeviceId());
                if(mobileDetail != null){
                    //存在则更新手机状态、上报时间
                    mobileDetail.setReadyState(1);
                    mobileDetail.setLastCheckTime(new Date());
                    mobileDetail.setHeartbeatLastTime(new Date());
                    mobileDetailMapper.updateByPrimaryKeySelective(mobileDetail);
                }else{
                    //不存在则插入新数据
                    MobileDetail mobileInfo = new MobileDetail();
                    BeanUtils.copyProperties(mobile,mobileInfo);
                    mobileDetailMapper.insertSelective(mobileInfo);
                }
            }
        }catch (Exception e){
            throw new ServiceException(300,"更新失败");
        }
        return Result.success("更新成功");
    }
}
