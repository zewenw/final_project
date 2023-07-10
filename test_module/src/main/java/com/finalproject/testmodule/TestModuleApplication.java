package com.finalproject.testmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestModuleApplication.class, args);
    }

}
