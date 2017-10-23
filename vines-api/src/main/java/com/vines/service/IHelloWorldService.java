package com.vines.service;

import com.vines.mybatis.pojo.User;

import java.util.List;

public interface IHelloWorldService {
    public String sayHello();
    public List<User>  sayUser();
}
