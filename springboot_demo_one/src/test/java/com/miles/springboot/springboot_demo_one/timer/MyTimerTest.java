package com.miles.springboot.springboot_demo_one.timer;

import org.junit.Test;

public class MyTimerTest {

    @Test
    public void testTaskRun(){
        MyTimer myTimer = new MyTimer();
        myTimer.taskRun();
    }
}