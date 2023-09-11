package com.langjialing.thymeleafdemo.controller;

import com.langjialing.thymeleafdemo.entity.User;
import com.langjialing.thymeleafdemo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/14 17:03
 */
@RestController
public class UserController1 {

    @Resource
    private UserService userService;

    @PostMapping("/save")
    @Transactional
    public User save(@RequestBody User user) {
        try{
            User save = userService.save(user);
            throw new RuntimeException("测试事务");
        } catch (Exception e){
            e.printStackTrace();
            // 这里注意：如果不抛出异常，事务是不会回滚的
            throw e;
        }

    }
}