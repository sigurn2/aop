package com.example.aop.service;

import com.example.aop.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestService extends JpaRepository<Test, String> {
}
