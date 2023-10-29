package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.File;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1366x766";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void PositiveFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Max");
        $("#lastName").setValue("Gor");
        $("#userEmail").setValue("maxgor@gmail.com");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("1122334455");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").val("English").pressEnter();
        $("#uploadPicture").uploadFile(new File("src/test/pic/frost.jpeg"));
        $("[for='gender-radio-1']").click();
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-3']").click();
        $("#currentAddress").setValue("text text text");
        $("#react-select-3-input").val("NCR").pressEnter();
        $("#react-select-4-input").val("Delhi").pressEnter();


    }


}
