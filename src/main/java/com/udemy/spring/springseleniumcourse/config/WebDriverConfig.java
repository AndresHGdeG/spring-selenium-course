package com.udemy.spring.springseleniumcourse.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.Duration;

@Configuration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private long timeout;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver chromeDriver(){
        WebDriverManager.chromiumdriver().setup();
        return new ChromeDriver();
    }

    @Bean
    //@Primary
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver fireFoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnMissingBean
    public WebDriver edgeDriver(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    @Bean
    public WebDriverWait webdriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }
}
