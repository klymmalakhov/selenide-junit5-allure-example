package com.github.klym.scenarios;

import com.github.klym.common.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * ExampleTest class
 */

@Epic("LearnThat")
@Feature("Client UI")
@Severity(SeverityLevel.NORMAL)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExampleTest extends BaseTest {

    @Test
    @Order(1)
    @Story("Portal Pizza")
    @Description("Validate the errors appearing")
    void mainTest() {
        this.contactPage = this.homePizzaPage.clickContactMenuItem();
        this.contactPage.clickOnSubmitButton();
        this.contactPage.validateEmailError("Email is required");
        this.contactPage.validateForenameError("Forename is required");
        this.contactPage.validateMessageError("Message is required");
        this.contactPage.fillForename("Dan").validateForenameErrorEmpty();
        this.contactPage.fillEmail("dan@abc.com").validateForenameErrorEmpty();
        this.contactPage.fillMessage("Nice Pizza").validateMessageErrorEmpty();
    }

    @Test
    @Order(2)
    @Story("Portal Pizza")
    @Description("Validate the Chunky Chips and Aioli pizza")
    void validatePizzaItem() {
        this.menuPage = this.homePizzaPage.clickMenuMenuItem();
        this.menuPage.clickSideTabItem();
        this.menuPage.validatePizzaPrice("$9.99");
        this.menuPage.validatePizzaKilojoules("3273 kJ");
    }
}
