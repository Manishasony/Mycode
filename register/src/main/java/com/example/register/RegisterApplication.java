package com.example.register;

import com.example.register.controllers.Authcontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
        (scanBasePackages={"com.example.register.Security.jwt",
        "com.example.register.Security.services","com.example.register.Security",
      "com.example.register.payload.request","com.example.register.payload.response","com.example.register.Security.jwt","com.example.register.controllers" })
@EntityScan("com.example.register.controllers")
//@ComponentScan(basePackageClasses = Authcontroller.class)
public class RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }

}
