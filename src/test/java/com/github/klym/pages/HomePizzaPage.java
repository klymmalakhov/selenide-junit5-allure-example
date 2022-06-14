package com.github.klym.pages;

import com.codeborne.selenide.Selenide;
import com.github.klym.common.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Accesshq Page class
 */

public class BasePizzaPage extends BasePage<BasePizzaPage> {


    @Step("Click on the Contact menu item")
    public BasePizzaPage clickContactMenuItem() {
        $("a.v-btn--text:nth-child(4)").click();
        return Selenide.page(ContactPage.class);
    }

    @Step("Click on the Menu menu item")
    public TalkWithUsPage clickMenuMenuItem() {
        $(".v-btn--active").click();
        return Selenide.page(TalkWithUsPage.class);
    }
}
