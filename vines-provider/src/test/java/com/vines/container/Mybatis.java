package com.vines.container;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.vines.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Mybatis {
	public static void main(String[] args) {
		String resource = "mapconfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new BufferedReader(new InputStreamReader(inputStream)));
			SqlSession session =sqlSessionFactory.openSession();
			User user=(User)session.selectOne("com.starsh.dao.mybatis.loadById", 2);
			System.out.println(user.getName());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
