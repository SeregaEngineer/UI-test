package com.google;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Element;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Google {
    @BeforeMethod
    public void beforeTest() {
        GooglePageSearch google = new GooglePageSearch();
        google.searchGoogle("Открытие");
        GooglePageResults results = new GooglePageResults();
        results.searchResult().shouldHave(size(6));
        results.getResult(1).shouldHave(text("www.open.ru")).click();





    }


    @Test
    public void main() {


    }
}
