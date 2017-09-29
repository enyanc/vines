package vines.mybatis.db;

import java.io.Serializable;

import com.vines.mybatis.util.ReflectionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisDao<T,PK extends Serializable> {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	protected SqlSessionFactory SqlSessionFactory;
	protected Class<T> entityClass;
	
	
	public MybatisDao(){
		this.entityClass= ReflectionUtils.getSuperClassGenricType(getClass());
	}
	
	
	/**
	 * 获取SqlSession
	 * @return
	 */
	public SqlSession getSession(){
		return SqlSessionFactory.openSession();
	}
	
	
	
	
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		SqlSessionFactory = sqlSessionFactory;
	}
	
	
}
