package com.vines.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vines.service.IHelloWorldService;
/**
 * Created by ken.lj on 2017/7/31.
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"service/dubbo-demo-consumer.xml"});
        context.start();

        IHelloWorldService demoService = (IHelloWorldService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello();// 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}
