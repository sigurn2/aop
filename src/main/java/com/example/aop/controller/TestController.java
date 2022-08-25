package com.example.aop.controller;

import com.example.aop.Sex;
import com.example.aop.entity.Test;
import com.example.aop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@ResponseBody
public class TestController {

    @Resource
    TestService service;


    @GetMapping("/add/{name}")
    public String addUser(@PathVariable() String name) {
        Test test = new Test(name, Sex.WOMAN);
        service.save(test);
        return "OK";
    }


}
