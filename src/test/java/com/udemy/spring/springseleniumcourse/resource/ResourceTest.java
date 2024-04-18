package com.udemy.spring.springseleniumcourse.resource;

import com.udemy.spring.springseleniumcourse.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;

public class ResourceTest extends SpringBaseTestNGTest {

    @Value("classpath:data/testdata.csv")
    private Resource resource;

    @Value("file:C:\\Users\\ahmx\\Documents\\Repositories\\spring-selenium-course\\src\\test\\resources\\data\\testdata.csv")
    private Resource externalResource;

    @Test
    public void testResource() throws IOException {
        Files.readAllLines(resource.getFile().toPath())
                .forEach(System.out::println);
    }
}
