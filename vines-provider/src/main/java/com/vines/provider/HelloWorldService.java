package com.vines.provider;

import com.github.pagehelper.PageInfo;
import com.vines.domain.User;
import com.vines.mybatis.dao.UserDao;
import com.vines.mybatis.db.Page;
import com.vines.service.IHelloWorldService;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class HelloWorldService implements IHelloWorldService {
    private Logger logger= LoggerFactory.getLogger(HelloWorldService.class);
    @Autowired
    private UserDao userDao;
    @Override
    public String sayHello() {
        Page page=new Page();
        page.setPageSize(10);
        page.setPageNum(1);
        PageInfo pageInfo= (PageInfo) userDao.selectPageList(new User(),page);
        logger.info(pageInfo+"==================================");
        List<User> list=pageInfo.getList();
        return JSONArray.fromObject(list).toString();
//        return "hello world";
    }

    @Override
    public List<User>  sayUser(){
        Page page=new Page();
        page.setPageSize(10);
        page.setPageNum(1);
        PageInfo pageInfo= (PageInfo) userDao.selectPageList(new User(),page);
        logger.info(pageInfo+"==================================");
        List<User> list=pageInfo.getList();
        return list;
    }
}
