package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer   //开启配置服务器功能 
@EnableDiscoveryClient
public class ConfigServerApplication{
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
