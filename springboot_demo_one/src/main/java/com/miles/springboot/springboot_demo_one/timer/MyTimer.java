package com.miles.springboot.springboot_demo_one.timer;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class MyTimer {

    @Scheduled(cron = "0/2 0 0 * 10-12 ? 2018")
    public void taskRun(){
        System.out.println("定时任务执行" + new Date());
    }
}
