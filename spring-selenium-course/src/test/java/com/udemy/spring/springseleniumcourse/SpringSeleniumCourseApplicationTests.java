package com.udemy.spring.springseleniumcourse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumCourseApplicationTests {

    @Autowired
    private User user;

    @Test
    void contextLoads() {
        user.printDetails();
    }

}
