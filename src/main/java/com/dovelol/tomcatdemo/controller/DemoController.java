package com.dovelol.tomcatdemo.controller;

import com.dovelol.tomcatdemo.bean.User;
import com.dovelol.tomcatdemo.service.MyService;
import com.dovelol.tomcatdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dovelol
 * @date 2018/9/20 14:35
 */

@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    public DemoController() {
        logger.info("DemoController 创建了");
    }

    @Autowired
    private MyService myService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public Map<String, Object> test() {
        myService.test();
        User user = userService.selectById(10L);
        Map<String, Object> map = new HashMap<>(2);
        map.put("name", "dovelol");
        map.put("age", "10");
        map.put("user", user);
        return map;
    }


}
