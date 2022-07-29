package com.zhs.dive.controller;

import com.alibaba.fastjson.JSON;
import com.zhs.dive.common.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "xml",produces = MediaType.APPLICATION_XML_VALUE)
    public User xmlUser(){
        return new User("xml");
    }

    @GetMapping(value = "json",produces = MediaType.APPLICATION_JSON_VALUE)
    public String jsonUser(){
        return JSON.toJSONString(new User("json"));
    }

}
