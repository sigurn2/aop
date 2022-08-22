package com.example.learnaop;

import com.example.learnaop.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LearnAopApplicationTests {

    @Resource
    private HelloService helloService;

    @Test
    void contextLoads() {
        helloService.sayHello();
    }

}
