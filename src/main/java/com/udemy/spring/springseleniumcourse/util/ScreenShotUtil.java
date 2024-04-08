package com.udemy.spring.springseleniumcourse.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver; // this works because WebDriverConfig cast to TakeScreenShot

    //@Autowired
    //private JavascriptExecutor js; // this works because WebDriverConfig cast to JavaScriptExecutor

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenShot(final String imgName) throws IOException {
        //js.executeScript("");
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.resolve(imgName).toFile());
    }
}
