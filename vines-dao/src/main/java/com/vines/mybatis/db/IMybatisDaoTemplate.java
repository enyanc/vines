package com.vines.mybatis.db;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;
public interface IMybatisDaoTemplate<T> {
    public PageInfo<T> selectPageList(T entity,Page page);
    public PageInfo<T> selectPageList(Map condition,Page page);
    public List<T> selectList(T entity);
    public List<T> selectList(Map condition);
    public <K,V> Map<K,V> selectMap(T entity,Page page);
    public <K,V> Map<K,V> selectMap(T entity,Page page,Map condition);
    public int insert(T entity);
    public int update(T entity);
    public int batchInser(List<T> entityList);
    public int batchUpdate(List<T> entityList);
    public int delete(T entity);
    public int batchDelete(List<T> entityList);
}
