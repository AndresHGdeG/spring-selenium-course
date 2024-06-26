package com.udemy.spring.springseleniumcourse.page.google;

import com.udemy.spring.springseleniumcourse.kelvin.annotation.Page;
import com.udemy.spring.springseleniumcourse.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButns;

    public void search(final String keyword) {
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB); // FIX FIREFOX
        this.searchButns
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d)-> this.searchBox.isDisplayed());
    }
}
