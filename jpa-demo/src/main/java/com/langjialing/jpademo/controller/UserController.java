package com.langjialing.jpademo.controller;

import com.langjialing.jpademo.entity.User;
import com.langjialing.jpademo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郎家岭伯爵
 * @time 2023/7/12 13:34
 */
@RestController
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/find")
    public User findById(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/findByNameLikeIgnoreCase")
    public List<User> findByNameLikeIgnoreCase(@RequestParam String name) {
        return userService.findByNameLikeIgnoreCase(name);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/findAllPage")
    public Page<User> findAllPage(Pageable pageable) {
        log.info("size:{}", pageable.getPageSize());
        log.info("page:{}", pageable.getPageNumber());
        return userService.findAll(pageable);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam Integer id) {
        userService.delete(id);
    }
}