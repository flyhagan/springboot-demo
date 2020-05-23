package com.hg.transation.service;

import java.util.List;

public interface BaseService<T> {
    // 查询所有
    List<T> findAll();

    //根据ID查询
    List<T> findById(Long id);

    //添加
    boolean create(T t);

    //删除（批量）
    boolean delete(Long... ids);

    //修改
    boolean update(T t);

    //批量添加
    boolean createBatch(List<T> t);
}
