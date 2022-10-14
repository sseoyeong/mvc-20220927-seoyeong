package com.study.mvc20220927seoyeong.controller;

import com.study.mvc20220927seoyeong.service.TestService;
import com.study.mvc20220927seoyeong.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    @Qualifier("ts1")
    private TestService testService;

    @GetMapping("/test")
        public String run() {
            testService.logic1();
            return "DI_IoC 수업";
        }
}
