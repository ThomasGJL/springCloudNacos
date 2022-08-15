package com.example.nacosprovider.controller;

import com.example.nacosprovider.config.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/home")
@RestController
@Slf4j
class ProviderController {

    @Autowired
    private User user;

    @GetMapping("/getValue")
    public String getValue() {

        String name = user.getName();
        String age = user.getAge();

        log.info("name is {} and age is {}", name, age);

        return "success";
    }



}