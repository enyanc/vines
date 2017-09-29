package com.vines.mybatis.db;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Component
public class MybatisDaoTemplate<T,PK extends Serializable> extends  MybatisDao implements IMybatisDaoTemplate<T>{
    private PageInfo<T> pageInfo;
    @Override
    public PageInfo<T> selectPageList(T entity, Page page) {
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<T> list=this.sqlSession.selectList(this.getClass().getName()+".selectPageList",entity);
        pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<T> selectPageList(Map condition, Page page) {
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<T> list=this.sqlSession.selectList(this.getClass().getName()+".selectPageListByMap",condition);
        pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public List<T> selectList(T entity) {
        Page page=new Page();
        page.setPageNum(0);
        page.setPageSize(0);
       return  selectPageList(entity,page).getList();
    }

    @Override
    public List<T> selectList(Map condition) {
        return null;
    }


    @Override
    public <K, V> Map<K, V> selectMap(T entity, Page page) {
        return null;
    }

    @Override
    public <K, V> Map<K, V> selectMap(T entity, Page page, Map condition) {
        return null;
    }

    @Override
    public int insert(T entity) {
        return this.sqlSession.insert(getClass().getName()+".add",entity);
    }

    @Override
    public int update(T entity) {
        return 0;
    }

    @Override
    public int batchInser(List<T> entityList) {
        return 0;
    }

    @Override
    public int batchUpdate(List<T> entityList) {
        return 0;
    }

    @Override
    public int delete(T entity) {
        return 0;
    }

    @Override
    public int batchDelete(List<T> entityList) {
        return 0;
    }

}

