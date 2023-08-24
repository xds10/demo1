package com.example.demo1.controller;
import com.example.demo1.dao.UserMapper;
import com.example.demo1.pojo.userBean;
import com.example.demo1.service.UVerify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import javax.annotation.Resource;
import java.util.HashMap;
import  java.util.Map;
import java.util.Objects;
@Controller
public class registerController {
    @Autowired
    private UVerify uv;
    @RequestMapping(value = "/registerback" , method = RequestMethod.POST)
    @ResponseBody
    public String registerback(String username ,
                            String password,String phone_num){
        System.out.println("爱你register!");
        //return "haha"+username+password;
        /*
        验证短信验证码(还没写
         */
        boolean VRet =uv.Registerify(username,password,phone_num);
        //return "/login1.html";
        /*
        VRet:验证username是否存在(username为学号,我认为没什么用)
        也可以验证一下密码强度
         */
        if(VRet){
            return "注册成功";
        }
        else{
            return "注册失败";
        }
    }
    @RequestMapping(value = "/register")
    //@ResponseBody
    public String register(){
        return "register";
    }
}
