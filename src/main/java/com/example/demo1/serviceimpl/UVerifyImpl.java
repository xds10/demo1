package com.example.demo1.serviceimpl;
import com.example.demo1.dao.UserMapper;
import com.example.demo1.pojo.userBean;
import com.example.demo1.service.UVerify;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("UVerify")
public class UVerifyImpl implements UVerify{
    @Autowired(required = false)
    private  UserMapper userm;//hahagogo
    @Override
    public Boolean Userverify(String username,String passwd){
        userBean u=userm.findbyUsername(username);
        if (u != null && passwd.equals(u.getPassword())) {
            ;
        } else {
            return false;
        }

        System.out.println("UVerify--password:"+passwd);
        System.out.println("UVerify--u.password:"+u.getPassword());
        if(passwd.equals((u.getPassword())))
            return true;
        else
            return false;
    }
}
