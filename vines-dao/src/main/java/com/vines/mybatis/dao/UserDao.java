package com.vines.mybatis.dao;

import com.vines.mybatis.db.MybatisDaoTemplate;
import com.vines.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends MybatisDaoTemplate<User,Integer> {
}
