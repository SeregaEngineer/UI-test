package com.google;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.*;



public class GooglePageResults {

    public ElementsCollection searchResult() {

        return $$(By.className("bkWMgd"));
    }


    public SelenideElement getResult(int index) {

        return $("div.r > a", index);
    }
}
