package com.zhs.dive.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("user")
    public User initUser(){
        return new User("xiaoming");
    }
}
