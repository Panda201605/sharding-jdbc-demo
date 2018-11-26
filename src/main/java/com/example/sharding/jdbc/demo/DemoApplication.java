package com.example.sharding.jdbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) //排除DataSourceConfiguratrion
//@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass = true)   //开启事物管理功能
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("demo start!!!!!!!!!!!!!!!!!!!!!");
    }
}
