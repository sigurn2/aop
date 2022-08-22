package com.example.learnaop.service.impl;

import com.example.learnaop.service.IHelloService;

public class IHelloServiceImpl implements IHelloService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    @Override
    public void err(Boolean isThrow) {
        System.out.println("Error begin");
        throw new RuntimeException("sss");
    }
}
