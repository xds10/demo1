package com.example.demo1.dao;
import com.example.demo1.pojo.userBean;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    public userBean findbyUsername(String username);
    public userBean addUser(String username,String password,String phone_num);
}
