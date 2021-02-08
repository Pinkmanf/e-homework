package com.example.loginsecond.controller;


import com.example.loginsecond.bean.Result;
import com.example.loginsecond.bean.User;
import com.example.loginsecond.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "登录界面";
    }

    @RequestMapping("/userRegister")
    public String register() {
        return "注册";
    }

    @RequestMapping("/userLogin")
    public String login() {
        return "登录界面";
    }

    @RequestMapping("/userUpdate")
    public String update() {
        return "修改密码";
    }

    @RequestMapping("/userSuccess")
    public String success() {
        return "签到成功";
    }

    @RequestMapping("/userCheck")
    public String check() {
        return "打卡界面";
    }



    @GetMapping(value = "/register")
    public String register(User user){
        Result result=userService.register(user);
        if(result.isSuccess())
        {
            return "注册成功";
        }
        else
            return "注册失败";
    }

    @GetMapping(value = "/login")
    public String login(User user){
        boolean success=userService.login(user).isSuccess();
        if(success==true)
            return "打卡界面";
        else
            return "登录失败";
    }

    @GetMapping(value = "/update")
    public String update(String password1,String password,String username){
        boolean success=userService.update(password1, password, username).isSuccess();
        if(success==true){
            return "修改成功";
        }
        else{
            return "修改失败";
        }
    }


//    @GetMapping(value = "/check")
//    public String check(String username,int info){
//        boolean success=userService.check(username,info).isSuccess();
//        if(success==true&&info!=1)
//            return "签到成功";
//        else
//            return "签到失败";
//    }


    @GetMapping(value="/return")
    public String rr(){
        return "登录界面";
    }
}

