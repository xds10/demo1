package com.example.demo1.pojo;
import java.io.Serializable;
public class userBean implements Serializable{
    private int id;
    private String username;
    private String Password;
    private String email;

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getUser(){return username;}
    public void setUser(String user){this.username=user;}
    public String getPassword(){return Password;}
    public void setPassword(String password){this.Password=password;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

}
