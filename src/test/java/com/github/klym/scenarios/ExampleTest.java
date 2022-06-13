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
    @Story("Portal UI")
    @Description("Check the accesshq Page")
    void mainTest() {
        this.accesshqPage.verifyWelcomeMessage("Welcome to the home of Human Quality for Enterprise Technology");
    }

    @Test
    @Order(2)
    @Story("Portal UI")
    @Description("Tack with us Page validation")
    void TackWithUsTest() {
        this.talkWithUsPage = this.accesshqPage.clickTalkWithUsButton();
        this.talkWithUsPage.verifyPhoneNumber("Free Call: 1800 999 585");
    }
}
