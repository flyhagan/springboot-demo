package com.hg.transation.mapper;

import com.hg.transation.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


@Mapper
public interface UserMapper {
    List<User> findAll();
    void saveBatch(@Param("param") List<User> user);
    @Select("select * from tb_user where id=#{id}")
    List<User> findById(Long id);
}
//@Mapper
//public interface UserMapper {
//    List<User> findAll();
//    //@Select("select * from tb_goods where id=#{id}")
//    //List<User> findById(Long id);
//    //@Insert("insert into tb_user values (#{id},#{username},#{password})")
//    //void addUser(User user);
//    //void saveBatch(@Param("param") List<User> user);
//}
