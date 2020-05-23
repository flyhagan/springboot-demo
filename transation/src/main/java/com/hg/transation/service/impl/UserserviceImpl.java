package com.hg.transation.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hg.transation.entity.Goods;
import com.hg.transation.entity.PageBean;
import com.hg.transation.entity.User;
import com.hg.transation.mapper.UserMapper;
import com.hg.transation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }


    @Override
    public List<User> findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public boolean create(User user) {
//        boolean flag = true;
//        try{
//            userMapper.addUser(user);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            flag = false;
//        }
//        return flag;
        return false;
    }


    @Override
    public boolean delete(Long... ids) {
        return true;
    }

    @Override
    public boolean update(User user) {
        return true;
    }

    @Override
    public boolean createBatch(List<User> userList) {
        boolean flag = true;
        try{
            userMapper.saveBatch(userList);
        }catch (Exception e){
            System.out.println(e.getMessage());
            flag = false;
        }
        return flag;
    }

}
