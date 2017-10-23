package com.vines.controller;

import com.vines.mybatis.pojo.User;

import java.util.List;

public interface RestUserService {
    public List<User> sayUser();
}
