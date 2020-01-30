package com.poc.springprofiles.controller;


import com.poc.springprofiles.config.ExampleBean;
import com.poc.springprofiles.config.PocConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springprofile")

public class ProfilePocController {

    @Value("${environment}")
    private String environment;

    private ExampleBean environmentBean;

    public ProfilePocController(ExampleBean environmentBean){
        this.environmentBean=environmentBean;
    }

    @GetMapping("/profile-in-application-properties")
    public ResponseEntity<String> returnEnvironment(){

        return ResponseEntity.ok(environment);
    }


    @GetMapping("/profile-on-bean")
    public ResponseEntity<ExampleBean> returnBean(){
        return ResponseEntity.ok(this.environmentBean);
    }
}
