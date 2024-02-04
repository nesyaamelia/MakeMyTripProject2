package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguagePage extends BasePage{

    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-cy='LanguageSwitcherWidget']")
    WebElement languageButton;

    @FindBy(xpath = "//div[@class='selectConWrap']")
    WebElement selectCountry;

    @FindBy(xpath = "(//p[@data-cy='GeographySections_24'])[3]")
    WebElement selectLanguage;

    @FindBy(xpath = "//button[@data-cy='GeographySwitcher_27']")
    WebElement buttonApply;

    @FindBy(xpath = "//span[@class='latoBold capText font11']")
    WebElement resultLanguage;

    public void setLanguageButton(){
       languageButton.click();
    }

    public void setSelectCountry(){
        selectCountry.click();
    }

    public void setSelectLanguage(){
        selectLanguage.click();
    }

    public void setButtonApply(){
        buttonApply.click();
    }

    public String getTextLanguage(){
        return resultLanguage.getText();
    }
}
