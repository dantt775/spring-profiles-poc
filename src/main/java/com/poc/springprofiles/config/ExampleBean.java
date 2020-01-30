package com.poc.springprofiles.config;

import org.springframework.beans.factory.annotation.Value;

public class ExampleBean {


    private String ipAddress;

    @Value("${environment}")
    private String profile;


    public ExampleBean(String ipAddress){
        this.ipAddress=ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getProfile() {
        return profile;
    }
}
