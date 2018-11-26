package com.example.sharding.jdbc.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Kane on 2018/1/17.
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long order_id;
    private Long user_id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

}
