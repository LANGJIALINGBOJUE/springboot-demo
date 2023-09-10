package com.langjialing.jpademo.service;

import com.langjialing.jpademo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/12 13:20
 */
public interface UserService {
    /**
     * 根据ID查询单个用户。
     * @param id id
     * @return user
     */
    User findById(Integer id);

    /**
     * 查找所有用户。
     * @return List
     */
    List<User> findAll();

    /**
     * 新增/更新用户。
     * @param user user
     * @return User
     */
    User save(User user);

    /**
     * 根据ID删除用户。
     * @param id ID
     */
    void delete(Integer id);

    /**
     * 查询所有用户（分页）。
     * @param pageable 分页参数
     * @return Page
     */
    Page<User> findAll(Pageable pageable);

    /**
     * 根性名字查询用户。
     * @param name name
     * @return List
     */
    List<User> findByNameLikeIgnoreCase(String name);
}