package com.example.aop.entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public class Base implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString().replaceAll("!", "");

    private String createUser;

    private LocalDateTime createTime;

    private String which;
}
