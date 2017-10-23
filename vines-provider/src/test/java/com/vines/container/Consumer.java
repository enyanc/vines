package com.vines.container;

import com.vines.service.IHelloWorldService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vines.mybatis.pojo.User;

import java.util.List;

/**
 * Created by ken.lj on 2017/7/31.
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();

        IHelloWorldService demoService = (IHelloWorldService) context.getBean("demoService"); // 获取远程服务代理
        List<User> list = demoService.sayUser();// 执行远程方法

        System.out.println(list+"=============="); // 显示调用结果
    }
}
