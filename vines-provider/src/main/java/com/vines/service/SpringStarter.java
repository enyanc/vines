package com.vines.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStarter {
    public static void main(String[] args) throws InterruptedException {
        String config_path= "/spring/applicationContext-root.xml";
        ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext(config_path);
        cxt.registerShutdownHook();
        Thread.currentThread().join();
    }
}
