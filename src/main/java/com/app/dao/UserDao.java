package com.app.dao;

import com.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * @Package com.app.entity
 * @ClassName User
 * @Author shaobin.wang
 * @Date 2019/03/22 10:28
 * @Version 1.0
 * @Description:
 **/
@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {


}
