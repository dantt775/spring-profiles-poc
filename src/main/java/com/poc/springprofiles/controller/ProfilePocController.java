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

    private ExampleBean environmentBean;

    public ProfilePocController(ExampleBean environmentBean){
        this.environmentBean=environmentBean;
    }

    @GetMapping("/show-profile")
    public ResponseEntity<ExampleBean> returnBean(){
        return ResponseEntity.ok(this.environmentBean);
    }
}
