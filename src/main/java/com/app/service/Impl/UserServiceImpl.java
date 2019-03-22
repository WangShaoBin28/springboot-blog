package com.app.service.Impl;

import com.app.dao.UserDao;
import com.app.entity.UserEntity;
import com.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Package com.app.service.Impl
 * @ClassName UserServiceImpl
 * @Author shaobin.wang
 * @Date 2019/03/22 10:35
 * @Version 1.0
 * @Description:
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(UserEntity userEntity) {
        userDao.save(userEntity);
    }
}
