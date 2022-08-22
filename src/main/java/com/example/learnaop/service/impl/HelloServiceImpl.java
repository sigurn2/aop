package com.example.learnaop.service.impl;

import com.example.learnaop.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello aop");
    }
}
