package com.google;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Float.parseFloat;


public class Google {
    @BeforeMethod
    public void beforeTest() {
        GooglePageSearch google = new GooglePageSearch();
        google.searchGoogle("Открытие");
        GooglePageResults results = new GooglePageResults();
        results.searchResult().shouldHave(size(9));
        results.getResult(0).shouldHave(text("www.open.ru")).click();


    }


    @Test
    public void main() {
        float byUSD = getFloat($("tr:nth-child(2) > td:nth-child(2) > div > span").getText());
        float saleUSD = getFloat($("tr:nth-child(2) > td:nth-child(4) > div > span").getText());
        float byEUR = getFloat($("tr:nth-child(3) > td:nth-child(2) > div > span").getText());
        float saleEUR = getFloat($("tr:nth-child(3) > td:nth-child(4) > div > span").getText());

        assert (byUSD < saleUSD) : "by USD more sale USD";
        assert (byEUR < saleEUR) : "by EUR more sale EUR";

    }

    public float getFloat(String str) {
        return parseFloat(str.replace(',', '.'));
    }


}
