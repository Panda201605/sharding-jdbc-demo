package com.example.sharding.jdbc.demo.dao;

import com.example.sharding.jdbc.demo.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface User1Mapper {

    List<UserEntity> getAll();

    void update(UserEntity user);

}
