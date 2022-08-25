package com.example.aop.aop.annotations.service.impl;

import com.example.aop.aop.annotations.Admin;
import com.example.aop.aop.annotations.service.SimpleService;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Override
    @Admin
    public void printHello(String name) {
        System.out.println("welcome my friends");
        System.out.println(name);
    }

    public void printDiff() {

        LocalDateTime dateTime = LocalDateTime.now();

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        LocalDateTime com = LocalDateTime.now();
        long l = Duration.between(dateTime, com).toMillis();
        System.out.println(l);

    }
}
