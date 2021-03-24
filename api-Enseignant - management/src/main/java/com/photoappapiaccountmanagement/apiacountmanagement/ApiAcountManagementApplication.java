package com.photoappapiaccountmanagement.apiacountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiAcountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiAcountManagementApplication.class, args);
    }

}
