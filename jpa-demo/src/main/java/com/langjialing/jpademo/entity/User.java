package com.langjialing.jpademo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/12 10:56
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private Integer userId;
    private Integer age;
    private String userName;
    private String password;
}