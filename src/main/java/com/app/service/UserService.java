package com.app.service;


import com.app.entity.UserEntity;

import java.util.List;

/**
 * @Package com.app.entity
 * @ClassName User
 * @Author shaobin.wang
 * @Date 2019/03/22 10:28
 * @Version 1.0
 * @Description:
 **/

public interface UserService {
    List<UserEntity> findAll();

    void save(UserEntity userEntity);

}
