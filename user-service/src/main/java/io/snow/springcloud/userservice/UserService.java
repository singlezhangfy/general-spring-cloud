package io.snow.springcloud.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
//@EnableOAuth2Client
@EnableFeignClients
@MapperScan(basePackages = "io.snow.springcloud.userservice.mapper")
public class UserService {
    public static void main(String[] args){
        SpringApplication.run(UserService.class,args);
    }
}
