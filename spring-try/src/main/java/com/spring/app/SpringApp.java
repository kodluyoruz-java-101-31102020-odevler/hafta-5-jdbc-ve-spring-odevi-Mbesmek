package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
        "com.spring"
})
public class SpringApp {
    public static void main(String[] args){

        SpringApplication.run(SpringApp.class,args);
    }
}
