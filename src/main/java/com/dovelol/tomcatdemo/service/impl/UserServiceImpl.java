package com.dovelol.tomcatdemo.service.impl;

import com.dovelol.tomcatdemo.bean.User;
import com.dovelol.tomcatdemo.mapper.UserMapper;
import com.dovelol.tomcatdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dovelol
 * @date 2018/10/9 17:24
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    public UserServiceImpl() {
        logger.info("UserServiceImpl 创建");
    }

    @Override
    public User selectById(Long id) {
        //User user = userMapper.selectByPrimaryKey(id);
        //logger.info("user:" + user);
        return null;
    }

    @Override
    public Long createUser(User user) {
        //userMapper.insertSelective(user);
        return user.getId();
    }
}
