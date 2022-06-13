package com.github.klym.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.github.klym.common.BasePage;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Accesshq Page class
 */

public class AccesshqPage extends BasePage<AccesshqPage> {

    @Step("Verify Dashboard title")
    public AccesshqPage verifyWelcomeMessage(String expected) {
        $("div#space.row div.inner-box").shouldHave(text(expected));
        return this;
    }

    @Step("Click on 'Talk with us' button")
    public TalkWithUsPage clickTalkWithUsButton() {
        $("#header-navigation > a.contact-button").click();
        return Selenide.page(TalkWithUsPage.class);
    }
}
