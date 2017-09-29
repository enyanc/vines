package com.vines.mybatis.db;

import java.io.Serializable;

import com.vines.mybatis.util.ReflectionUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MybatisDao<T,PK extends Serializable> {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	protected SqlSessionTemplate sqlSession;

	protected Class<T> entityClass;


	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	public MybatisDao(){
		this.entityClass= ReflectionUtils.getSuperClassGenricType(getClass());
	}

	/**
	 * 获取sqlSessionFactory
	 * @return
	 */
	public SqlSessionFactory getSessionSqlFactory(){
		return sqlSession.getSqlSessionFactory();
	}
}
