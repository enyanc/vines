package com.vines.service;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.vines.domain.User;

import java.util.List;

public interface IHelloWorldService {
    public String sayHello();
    public List<User>  sayUser();
}
