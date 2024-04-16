package com.udemy.spring.springseleniumcourse.page.google;

import com.udemy.spring.springseleniumcourse.kelvin.annotation.Page;
import com.udemy.spring.springseleniumcourse.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
public class SearchResult extends Base {


    @FindBy(css ="div.MjjYud")
    private List<WebElement> results;

    public int getCount() {
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d)-> !this.results.isEmpty());
    }
}
