package com.hg.transation.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hg.transation.entity.Goods;
import com.hg.transation.entity.PageBean;
import com.hg.transation.mapper.GoodsMapper;
import com.hg.transation.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return null;
    }

    @Override
    public List<Goods> findById(Long id) {
        return null;
    }

    @Override
    public boolean create(Goods goods) {
        return false;
    }

    @Override
    public boolean delete(Long... ids) {
        return false;
    }

    @Override
    public boolean update(Goods goods) {
        return false;
    }

    @Override
    public boolean createBatch(List<Goods> t) {
        return false;
    }

    @Override
    public PageBean findByPage(Goods goods, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);

        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Goods> page = goodsMapper.findByPage(goods);

        return new PageBean(page.getTotal(), page.getResult());
    }
}
