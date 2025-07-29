package com.bank.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/public")
    public String publicApi(){
        return "this is public endpoint";
    }
    @GetMapping("/private")
    public String privateApi(){
        return "this is private endpoint";
    }

    @GetMapping("/def")
    public String defApi(){
        return "this is def endpoint";
    }
}
