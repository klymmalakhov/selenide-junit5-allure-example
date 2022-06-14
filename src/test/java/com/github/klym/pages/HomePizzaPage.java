package com.github.klym.pages;

import com.codeborne.selenide.Selenide;
import com.github.klym.common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * HomePizza Page class
 */

public class HomePizzaPage extends BasePage<HomePizzaPage> {
    @Step("Click on the Contact menu item")
    public ContactPage clickContactMenuItem() {
        $("a.v-btn--text:nth-child(4)").click();
        return Selenide.page(ContactPage.class);
    }
    @Step("Click on the Menu menu item")
    public MenuPage clickMenuMenuItem() {
        $(By.xpath("//*[contains(@href, 'menu') and contains(@class,'v-btn v-btn--router v-btn--text theme--light v-size--default') ]")).click();
        return Selenide.page(MenuPage.class);
    }
}
