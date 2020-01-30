package com.poc.springprofiles.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Profiles;

@Configuration

public class PocConfig {

    @Bean
    @Profile("!local & !dev")
    public ExampleBean  productionBean(){
        return new ExampleBean("172.18.19");
    }

    @Bean
    @Profile("local")
    public ExampleBean  localBean(){
        return new ExampleBean("localhost:3306");
    }

    @Bean
    @Profile("dev")
    public ExampleBean  devBean(){
        return new ExampleBean("192.168.0.1:8080");
    }

}
