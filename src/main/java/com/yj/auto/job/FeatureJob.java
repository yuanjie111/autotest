package com.yj.auto.job;

import com.yj.auto.project.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Slf4j
@Component
public class FeatureJob {
    @Resource
    ProjectService projectService;

    @Scheduled(cron = "* * 0/5 * * *")
    public void syncProject(){
        log.info("定时任务FeatureJob");
        projectService.getFeatures();
    }
}
