package com.example.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "springcache")
public interface UserFeign {


    @GetMapping("/user/list")
    List getUserlist();

}
