package com.udemy.spring.springseleniumcourse.page;


import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public abstract class Base {

    @Lazy
    @Autowired
    protected WebDriver driver;

    @Lazy
    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void intit(){
        PageFactory.initElements(this.driver, this);
    }

    public abstract boolean isAt();

}
