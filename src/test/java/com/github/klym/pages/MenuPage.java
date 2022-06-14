package com.github.klym.pages;

import com.github.klym.common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * MenuPage Page class
 */

public class MenuPage extends BasePage<MenuPage> {

    @Step("Click on the Side tab item")
    public MenuPage clickSideTabItem() {
        $("div.v-tab:nth-child(3)").click();
        return this;
    }

    @Step("Validate Chunky Chips and Aioli price")
    public MenuPage validatePizzaPrice(String expectedPrice) {
        $(By.xpath("//*[contains(@class, 'flex mb-2 mt-5 xs12 sm6 md3 lg2')]//*[contains(text(),'Chunky Chips and Ai')]/../../../..//*[contains(@class, 'price')]"))
                .shouldHave(text(expectedPrice));
        return this;
    }

    @Step("Validate Chunky Chips and Aioli Kilojoules")
    public MenuPage validatePizzaKilojoules(String expectedKilojoules) {
        $(By.xpath("//*[contains(@class, 'flex mb-2 mt-5 xs12 sm6 md3 lg2')]//*[contains(text(),'Chunky Chips and Ai')]/../../../..//*[contains(@class, 'kilojoules grey--text text--darken-1 caption')]"))
                .shouldHave(text(expectedKilojoules));
        return this;
    }
}
