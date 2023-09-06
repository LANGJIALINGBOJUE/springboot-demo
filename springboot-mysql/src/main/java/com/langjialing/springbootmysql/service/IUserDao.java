package com.langjialing.springbootmysql.service;

import com.langjialing.springbootmysql.pojo.User;

import java.util.List;

/**
 * @author 郎家岭伯爵
 */
public interface IUserDao {
    /**
     * 新增用户
     * @param user user
     */
    void insert(User user);

    /**
     * 更新用户
     * @param user user
     */
    void update(User user);

    /**
     * 根据ID删除用户
     * @param id id
     */
    void delete(int id);

    /**
     * 根据ID查找用户
     * @param id id
     * @return user
     */
    User findById(int id);

    /**
     * 查找用户列表
     * @return List
     */
    List<User> findAll();
}