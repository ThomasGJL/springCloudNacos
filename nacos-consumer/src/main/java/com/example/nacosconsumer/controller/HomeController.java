package com.example.nacosconsumer.controller;

import com.example.nacosconsumer.feign.UserFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {

    @Resource
    UserFeign userFeign;

    @GetMapping("/home")
    public List home() {

        return userFeign.getUserlist();
    }

}
