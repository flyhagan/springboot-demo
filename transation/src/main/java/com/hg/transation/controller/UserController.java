package com.hg.transation.controller;

import com.hg.transation.entity.Goods;
import com.hg.transation.entity.PageBean;
import com.hg.transation.entity.User;
import com.hg.transation.service.GoodsService;
import com.hg.transation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

//    @RequestMapping(value = "/findById", method = RequestMethod.GET)
//    public List<User> findById(Long id){
//        return userService.findById(id);
//    }
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String,Object> create(@RequestBody User user){
//        boolean flag = userService.create(user);
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("flag",flag);
//        return resultMap;
//    }
    @RequestMapping(value = "/createBatch", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> createBatch(@RequestBody List<User> list){
        boolean flag = userService.createBatch(list);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("flag",flag);
        return resultMap;
    }

}
