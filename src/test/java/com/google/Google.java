package com.google;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Element;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class Google {
    @BeforeMethod
    public void beforeTest() {
        GooglePageSearch google = new GooglePageSearch();
        google.searchGoogle("Открытие");
        ElementsCollection result = $$(By.className("bkWMgd"));
        //$$(By.className("bkWMgd")).shouldHave(("https://www.open.ru/"));

       // $(By.name("q")).val("selenide").pressEnter();
       // $$("#res .g").shouldHave(sizeGreaterThan(1));
       /* $("#res .g").shouldBe(visible).shouldHave(
                text("Selenide: concise UI tests in Java"),
                text("selenide.org"));   */
    }


    @Test
    public void main() {


    }
}
