package com.poc.springprofiles.config;

public class ExampleBean {


    private String ipAddress;
    private String environment;


    public ExampleBean(String ipAddress, String environment){
        this.environment=environment;
        this.ipAddress=ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getEnvironment() {
        return environment;
    }
}
