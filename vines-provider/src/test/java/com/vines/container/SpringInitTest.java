package com.vines.container;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringInitTest  {
	
	@Test
	public void  init(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext-root.xml");
		DruidDataSource dataSource=(DruidDataSource)context.getBean("dataSource_druid");
		//System.out.println(src.getUser());
		System.out.println(dataSource);
	}
	@Before
	public void beforeInit() {
		System.out.println("初始化之前................");
	}
	
	@After
	public void AfterInit() {
		System.out.println("初始化之后可以做任何的操作哟................");
	}
}
