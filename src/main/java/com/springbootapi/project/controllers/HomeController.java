package com.springbootapi.project.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Map<String,String> homePage(){
        Map<String,String> map = new HashMap<>();
        map.put("Version",appVersion);
        return map;
    }
}
