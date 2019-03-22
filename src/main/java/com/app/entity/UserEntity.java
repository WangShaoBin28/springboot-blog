package com.app.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Package com.app.entity
 * @ClassName User
 * @Author shaobin.wang
 * @Date 2019/03/22 10:28
 * @Version 1.0
 * @Description:
 **/
@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
}
