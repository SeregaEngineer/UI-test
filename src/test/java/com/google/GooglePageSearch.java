package com.google;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglePageSearch {
    public void searchGoogle(String txt) {
        open("http://www.google.com");
        $(By.name("q")).setValue(txt).pressEnter();
    }
}
