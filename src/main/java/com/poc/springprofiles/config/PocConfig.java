package com.poc.springprofiles.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PocConfig {

    @Bean
    @Profile("prod")
    public String  productionBean(){
        return "production";
    }

    @Bean
    @Profile("local")
    public String  localBean(){
        return "local";
    }

}
