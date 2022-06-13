package com.github.klym.pages;

import com.codeborne.selenide.Selenide;
import com.github.klym.common.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * TalkWithUs Page class
 */


public class TalkWithUsPage extends BasePage<TalkWithUsPage> {

    @Step("Verify phone number")
    public TalkWithUsPage verifyPhoneNumber(String expected) {
        $("#article-header > div > h2").shouldHave(text(expected));
        return this;
    }
}
