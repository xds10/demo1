package com.example.demo1.dao;
import com.example.demo1.pojo.userBean;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    public userBean findbyUsername(String username);
}
