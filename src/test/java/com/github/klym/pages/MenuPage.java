package com.github.klym.pages;

import com.codeborne.selenide.Selenide;
import com.github.klym.common.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

/**
 * Accesshq Page class
 */

public class MenuPage extends BasePage<MenuPage> {


    @Step("Click on the Contact menu item")
    public ContactPage clickContactMenuItem() {
        $("a.v-btn--text:nth-child(4)").click();
        return Selenide.page(ContactPage.class);
    }

    @Step("Click on the Menu menu item")
    public MenuPage clickMenuMenuItem() {
        $(".v-btn--active").click();
        return Selenide.page(MenuPage.class);
    }
}
