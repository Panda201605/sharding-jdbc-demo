package com.example.sharding.jdbc.demo.service;

import com.example.sharding.jdbc.demo.model.UserEntity;
import com.example.sharding.jdbc.demo.model.UserSexEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class User1ServiceTest {

    @Autowired
    private User1Service user1Service;

    @Test
    public void getUsers() {

        List<UserEntity> userList = user1Service.getUsers();
        for (UserEntity each : userList){
            log.info(each.toString());
        }

    }

    @Test
    public void updateTransactional() {

        //random.nextLong()会有负数，取模还会有负数。 random.nextInt()会有负数，random.nextInt(int args)不会有负数
        Random random = new Random();
        Long id = Math.abs(random.nextLong());
        Long userId = Math.abs(random.nextLong());
        Long orderId = Math.abs(random.nextLong());
//        System.out.println("id: " + id + " userId: " + userId + " orderId: " + orderId);

        UserEntity user = new UserEntity();
        user.setId(id);
        user.setNickName("pan");
        user.setUser_id(userId);
        user.setOrder_id(orderId);
        user.setPassWord("123456");
        user.setUserName("name");
        user.setUserSex(UserSexEnum.MAN);
        user1Service.updateTransactional(user);
    }
}