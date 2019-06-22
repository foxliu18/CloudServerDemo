package com.feign.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(defaultValue = "liu", required = false) String name){
        return hiService.sayHi(name);
    }
}
