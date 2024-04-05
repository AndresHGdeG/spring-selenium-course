package com.udemy.spring.springseleniumcourse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumCourseApplicationTests {

    @Autowired
    private User user;

    @Value("${URL:https://www.google.com}")
    private String url;

    @Value("${Path}")
    private String path;

    @Value("${fruits}")
    private List<String> fruits;

    @Value("${timeout}")
    private int timeout;

    @Test
    void contextLoads() {
        this.user.printDetails();
        System.out.println(this.url);
        System.out.println(this.path);
        System.out.println(this.timeout);
        System.out.println(this.fruits);
        System.out.println(this.fruits.size());
    }

}
