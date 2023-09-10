package com.langjialing.jpademo.repository;

import com.langjialing.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/12 13:18
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