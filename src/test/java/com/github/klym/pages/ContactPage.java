package com.github.klym.pages;

import com.github.klym.common.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

/**
 * Contact Page class
 */

public class ContactPage extends BasePage<ContactPage> {

    @Step("Fill the forename")
    public ContactPage fillForename(String forenameValue) {
        $("#forename").setValue(forenameValue);
        return this;
    }

    @Step("Fill the message")
    public ContactPage fillMessage(String messageValue) {
        $("#message").setValue(messageValue);
        return this;
    }

    @Step("Fill email")
    public ContactPage fillEmail(String emailValue) {
        $("#email").setValue(emailValue);
        return this;
    }

    @Step("Click on the submit button")
    public ContactPage clickOnSubmitButton() {
        $(".btnPrimary").click();
        return this;
    }

    @Step("Validate a forename error")
    public ContactPage validateForenameError(String errorMessage) {
        $("#forename-err").shouldHave(text(errorMessage));
        return this;
    }

    @Step("Validate a message error")
    public ContactPage validateMessageError(String errorMessage) {
        $("#message-err").shouldHave(text(errorMessage));
        return this;
    }

    @Step("Validate a email error")
    public ContactPage validateEmailError(String errorMessage) {
        $("#email-err").shouldHave(text(errorMessage));
        return this;
    }

    @Step("Validate a forename error isn't present")
    public ContactPage validateForenameErrorEmpty() {
        $("#forename-err").shouldNot(exist);
        return this;
    }

    @Step("Validate a message error isn't present")
    public ContactPage validateMessageErrorEmpty() {
        $("#message-err").shouldNot(exist);
        return this;
    }

    @Step("Validate a email error isn't present")
    public ContactPage validateEmailErrorEmpty() {
        $("#email-err").shouldNot(exist);
        return this;
    }
}
