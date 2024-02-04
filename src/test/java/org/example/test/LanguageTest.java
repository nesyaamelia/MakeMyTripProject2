package org.example.test;

import org.example.pages.LanguagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest {

    @Test(priority = 2, description = "Select Language USA from Homepage")

    public void stepSelectLanguage (){
        languageButtonClick();
        selectCountryClick();
        selectLanguage();
        buttonApplyClick();
    }
    private void languageButtonClick(){
        LanguagePage language = new LanguagePage(driver);
        language.setLanguageButton();
    }

    private void selectCountryClick(){
        LanguagePage language = new LanguagePage(driver);
        language.setSelectCountry();
    }

    private void selectLanguage(){
        LanguagePage language = new LanguagePage(driver);
        language.setSelectLanguage();
    }

    private void buttonApplyClick(){
        LanguagePage language = new LanguagePage(driver);
        language.setButtonApply();
    }

    private void textLanguageResult(){
        String expectedLanguage = "USA";
        LanguagePage language = new LanguagePage(driver);
        String actualLanguage = language.getTextLanguage();
        Assert.assertEquals(actualLanguage, expectedLanguage, "Language Result");
    }
}
