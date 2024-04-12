package com.udemy.spring.springseleniumcourse.googletest;

import com.udemy.spring.springseleniumcourse.SpringBaseTestNGTest;
import com.udemy.spring.springseleniumcourse.page.google.GooglePage;
import com.udemy.spring.springseleniumcourse.util.ScreenShotUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Google1Test extends SpringBaseTestNGTest {

    @Lazy
    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        System.out.println("Hello world");
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        //Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.googlePage.getSearchComponent().search("enviroment");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        //this.screenShotUtil.takeScreenShot("img.png");
        //this.googlePage.close();
    }

}
