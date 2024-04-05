package com.udemy.spring.springseleniumcourse;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumCourseApplicationTests {

    @Autowired
    private User user;

    @Autowired
    private Faker fakerAuto;

    @Test
    void contextLoads() {
        System.out.println(this.fakerAuto.name().fullName());
        user.printDetails();
    }

}
