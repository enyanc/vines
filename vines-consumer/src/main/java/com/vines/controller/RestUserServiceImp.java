package com.vines.controller;


import com.vines.config.SystemProperties;
import com.vines.domain.Todo;
import com.vines.domain.User;
import com.vines.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableConfigurationProperties(SystemProperties.class)
public class RestUserServiceImp implements RestUserService {

    @Autowired
    IHelloWorldService demoService;

    @Autowired
    SystemProperties systemProperties;

    @RequestMapping("/")
    public String sayUser() {
        System.out.println(demoService.sayHello()+"==================================");
        System.out.println(systemProperties.getAge()+"====================="+systemProperties.getName());
//        return demoService.sayHello();
        return "hhhhhh";

    }


    @RequestMapping(value="/single",method = RequestMethod.POST)
    public Todo getTodos(@RequestBody Todo todo) {
        System.out.println(demoService.sayHello()+"==================================");
        System.out.println(todo.getDesc()+"=========================================");
        Todo item1 = new Todo();
        item1.setId("1");
        item1.setCompleted(false);
        item1.setDesc("go swimming");
        User user=new User();
        user.setAge(11);
        user.setName("how are you");
        item1.setUser(user);
        List<User> list=new ArrayList<User>();
        list.add(user);
        item1.setUserList(list);
        return item1;
    }

//jackson对基本类型和集合类型的序列化根元素的命名无法更改，建议包装成对象。
    @RequestMapping(value="/todos" )
    public List<Todo>  getAllTodos() {
        List<Todo> todos = new ArrayList<Todo>();
        Todo todo1 = new Todo();
        todo1.setId("1");
        todo1.setCompleted(false);
        todo1.setDesc("你好");
        todos.add(todo1);
        Todo item2 = new Todo();
        item2.setId("1");
        item2.setCompleted(true);
        item2.setDesc("go for lunch");
        todos.add(item2);
        return todos;
    }


}
