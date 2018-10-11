package com.dovelol.tomcatdemo.controller;

import com.dovelol.tomcatdemo.Utils.ApiResponse;
import com.dovelol.tomcatdemo.bean.User;
import com.dovelol.tomcatdemo.service.MyService;
import com.dovelol.tomcatdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dovelol
 * @date 2018/10/11 9:22
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController() {
        logger.info("UserController 创建了");
    }

    @Autowired
    private MyService myService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public ApiResponse<?> getUser(@RequestParam(value = "id") Long id) {
        myService.test();
        return new ApiResponse<>(ApiResponse.Status.SUCCESS, userService.selectById(id));
    }

    @PostMapping(value = "/user")
    public ApiResponse<?> createUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") Integer age) {
        myService.test();
        User user = new User();
        user.setName(name);
        user.setAge(age);
        Long id = userService.createUser(user);
        user.setId(id);
        return new ApiResponse<>(ApiResponse.Status.SUCCESS, user);
    }

}
