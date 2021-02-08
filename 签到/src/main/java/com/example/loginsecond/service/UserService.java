package com.example.loginsecond.service;

import com.example.loginsecond.bean.Result;
import com.example.loginsecond.bean.User;
import com.example.loginsecond.dao.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserService {

    //@Autowired
    private final UserMapper userMapper;



    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    public Result register(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.findUserByName(user.getUsername());
            if(existUser != null){
                //如果用户名已存在
            }else{
                userMapper.register(user);
                //System.out.println(user.getId());
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    public Result login(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Long userId= userMapper.login(user);
            if(userId == null){
            }else{
                result.setSuccess(true);
                user.setId(userId);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Result update(String password1,String password,String username){
        Result result=new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            boolean user =userMapper.update(password1, password, username);
            if(user == false){
            }else{
                result.setSuccess(true);
                result.setDetail(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

//    public Result check(String username,int info) {
//        Result result = new Result();
//        result.setSuccess(false);
//        result.setDetail(null);
//        try {
//            boolean user= userMapper.check(username,info);
//            if(user == false){
//            }else{
//                result.setSuccess(true);
//                result.setDetail(true);
//            }
//        } catch (Exception e) {
//            result.setMsg(e.getMessage());
//            e.printStackTrace();
//        }
//        return result;
//    }
}