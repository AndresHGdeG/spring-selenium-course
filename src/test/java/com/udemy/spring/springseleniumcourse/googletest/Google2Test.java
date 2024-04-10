package com.udemy.spring.springseleniumcourse.googletest;

import com.udemy.spring.springseleniumcourse.SpringBaseTestNGTest;
import com.udemy.spring.springseleniumcourse.page.google.GooglePage;
import com.udemy.spring.springseleniumcourse.util.ScreenShotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import java.io.IOException;

public class Google2Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot("img.png");
    }
}
