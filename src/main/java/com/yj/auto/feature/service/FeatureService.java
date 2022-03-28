package com.yj.auto.feature.service;

import com.yj.auto.common.Result;
import com.yj.auto.mapper.FeatureInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FeatureService {
    @Resource
    FeatureInfoMapper featureInfoMapper;


}
