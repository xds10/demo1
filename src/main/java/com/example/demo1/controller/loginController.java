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
public class loginController {

    @Autowired
    private UVerify uv;
    @RequestMapping(value = "/loginback" , method = RequestMethod.POST)
    @ResponseBody
    public String loginback(String username ,
                            String password){
        System.out.println("爱你dd!");
        //return "haha"+username+password;

        boolean VRet =uv.Userverify(username,password);
        return "/login1.html";
        /*
        if(VRet){

        }
        else{
            return "登录失败";
        }*/
    }
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(){
        return "login";
    }

}
