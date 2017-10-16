package com.vines.service.rest;


import com.vines.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserServiceImp implements RestUserService {

    @Autowired
    IHelloWorldService demoService;

    @RequestMapping("/")
    public String sayUser() {
        return demoService.sayHello();
    }

}
