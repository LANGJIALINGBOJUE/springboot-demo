package com.langjialing.thymeleafdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/14 9:34
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