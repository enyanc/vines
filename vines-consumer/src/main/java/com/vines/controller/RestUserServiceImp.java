package com.vines.controller;


import com.vines.config.SystemProperties;
import com.vines.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(SystemProperties.class)
public class RestUserServiceImp implements RestUserService {

//    @Autowired
//    IHelloWorldService demoService;

    @Autowired
    SystemProperties systemProperties;

    @RequestMapping("/")
    public String sayUser() {
        System.out.println(systemProperties.getAge()+"====================="+systemProperties.getName());
//        return demoService.sayHello();
        return "hhhhhh";

    }

}
