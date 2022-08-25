package com.example.aop;

import com.example.aop.aop.annotations.service.SimpleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AopApplicationTests {

    @Resource
    SimpleService service;

    @Test
    void contextLoads() {
        service.printHello("why");
    }

    @Test
    void testDurations() {
        service.printDiff();
    }
}
