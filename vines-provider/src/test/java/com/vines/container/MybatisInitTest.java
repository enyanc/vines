package com.vines.container;

import com.github.pagehelper.PageInfo;
import com.vines.domain.User;
import com.vines.mybatis.dao.UserDao;
import com.vines.mybatis.db.Page;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/spring/applicationContext-root.xml")
public class MybatisInitTest {
	private Logger log= Logger.getLogger(MybatisInitTest.class);
	@Autowired(required = true)
	private UserDao userDao;

	@Test
	@Transactional(propagation= Propagation.REQUIRED)
	public void init(){
		try {
			Page page=new Page();
			page.setPageSize(10);
			page.setPageNum(1);
			PageInfo pageInfo= (PageInfo) userDao.selectPageList(new User(),page);
			log.info(pageInfo+"==================================");
			List<User> list=pageInfo.getList();
			for(User u:list){
				System.out.println(u.getName()+"====================");
			}
//			User user=(User)sqlSession.selectOne("com.starsh.dao.mybatis.User.loadById", 2);
//			System.out.println(user.getName()+"-------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert(){
		User user=null;
		for(int i=11;i<20;i++){
			user=new User();
			user.setName("牛奶和咖啡组合"+i);
			user.setSex("nv");
			userDao.insert(user);
		}
	}
	public void update(){
		User user=new User();
		user.setId(1);
		user.setName("张三的故事");
		try{
//			sqlSession.update("com.starsh.dao.mybatis.User.update",user);
		}catch(Exception e){
			
		}finally{
			
		}
	}
	public void delete(){
		User user=new User();
		user.setId(1);
//		sqlSession.delete("com.starsh.dao.mybatis.User.delete",user);
	}
}
