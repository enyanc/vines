package com.vines.provider;

import com.vines.service.IHelloWorldService;

@org.springframework.stereotype.Service
public  class HelloWorldService implements IHelloWorldService {
    @Override
    public String sayHello() {
        return "HELLO WORLD";
    }
}
