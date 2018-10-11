package com.dovelol.tomcatdemo.service.impl;

import com.dovelol.tomcatdemo.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dovelol
 * @date 2018/10/9 15:03
 */
@Service
public class MyServiceImpl implements MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public MyServiceImpl() {
        logger.info("MyServiceImpl 创建");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void test() {
        logger.info("test方法");
    }
}
