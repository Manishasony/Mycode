package com.example.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
       (scanBasePackages={
       "com.example.login", "com.securityRest.configs","com.securityRest.controllers"})
@EntityScan("com.example.login")
//@ComponentScan(basePackageClasses = AuthController.class)
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
