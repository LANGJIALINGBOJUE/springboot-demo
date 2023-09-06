package com.langjialing.springbootmysql.controller;

import com.langjialing.springbootmysql.service.IUserDao;
import com.langjialing.springbootmysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 郎家岭伯爵
 * @Description UserController
 * @Date 2023/6/3 21:03
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserDao userDao;

    @PostMapping("/insertUser")
    public String insertUser(@RequestBody User user){
        try{
            userDao.insert(user);
            return "用户添加成功！";
        } catch (Exception e){
            return "用户添加失败！失败信息为：" + e.getMessage();
        }
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userDao.update(user);
        return "用户更新成功！";
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(@RequestParam int id){
        userDao.delete(id);
    }

    @GetMapping("/findUserById")
    public User findUserById(@RequestParam int id){
        return userDao.findById(id);
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userDao.findAll();
    }
}