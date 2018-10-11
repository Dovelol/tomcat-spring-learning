package com.dovelol.tomcatdemo.mapper;

import com.dovelol.tomcatdemo.bean.User;

/**
 * @author Dovelol
 * @date 2018/10/11 9:13
 */
public interface UserMapper {

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

}
