package com.langjialing.thymeleafdemo.repository;

import com.langjialing.thymeleafdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/14 9:35
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 自定义查询方法
     * @param name name
     * @return List
     */
    @Query("select u from User u where u.userName like concat('%',?1,'%')")
    List<User> findByNameLikeIgnoreCase(String name);
}