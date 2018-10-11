package com.dovelol.tomcatdemo.service;

import com.dovelol.tomcatdemo.bean.User;

/**
 * @author Dovelol
 * @date 2018/10/9 17:20
 */
public interface UserService {

    User selectById(Long id);

    Long createUser(User user);

}
