package com.langjialing.druiddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/11 15:13
 */
@RestController
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test(@RequestParam Integer id){
        String sql = "select user_name from user where user_id = " + id;
        String result = jdbcTemplate.queryForObject(sql, String.class);
        return result;
    }
}