package com.udemy.spring.springseleniumcourse.googletest;

import com.udemy.spring.springseleniumcourse.SpringBaseTestNGTest;
import com.udemy.spring.springseleniumcourse.page.google.GooglePage;
import com.udemy.spring.springseleniumcourse.util.ScreenShotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import java.io.IOException;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("spirng boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        System.out.println(this.googlePage.getSearchResult().getCount());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot("img.png");
    }

}
