package com.udemy.spring.springseleniumcourse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumCourseApplicationTests {

    @Test
    void contextLoads() {
        Address address = new Address();
        Salary salary = new Salary();
        User user = new User(address, salary);
        user.printDetails();

    }

}
