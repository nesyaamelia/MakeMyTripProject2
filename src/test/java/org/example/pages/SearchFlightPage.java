package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchFlightPage extends BasePage{

    public SearchFlightPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='fromCity']")
    WebElement fromCityClick;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement fromCitySearch;

    @FindBy(id = "fromCity")
    WebElement getValue;

    @FindBy(xpath = "(//ul[@role='listbox']/li)[1]")
    WebElement clickResultCity;

    @FindBy(xpath = "//label[@for='toCity']")
    WebElement toCityClick;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement toCitySearch;

    @FindBy(id = "toCity")
    WebElement getValueToCity;

    @FindBy(xpath = "//div[@aria-label='Wed Feb 14 2024']")
    WebElement departureDate;

    @FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[4]")
    WebElement returnDateOpen;

    @FindBy(xpath = "//div[@aria-label='Thu Feb 15 2024']")
    WebElement returnDate;

    @FindBy(xpath = "//p[@data-cy='submit']/a")
    WebElement buttonSearch;

    @FindBy(xpath = "//button[@class='button buttonSecondry buttonBig fontSize12 relative']")
    WebElement closeOverlay;

    @FindBy(xpath = "(//input[@id='listingFilterCheckbox'])[5]")
    WebElement checkboxFilter;


    public String selectCityFrom(String input){
        fromCityClick.click();
        fromCitySearch.sendKeys(input);
        delay(SHORT_DELAY);
        clickResultCity.click();
        delay(SHORT_DELAY);
        String cityResult = getValue.getAttribute("value");
        return cityResult;
    }

    public String selectCityTo(String input){
        toCityClick.click();
        toCitySearch.sendKeys(input);
        delay(SHORT_DELAY);
        clickResultCity.click();
        delay(SHORT_DELAY);
        String cityResult = getValueToCity.getAttribute("value");
        return cityResult;
    }

    public void selectDepartureDate(){
        departureDate.click();
    }

    public void selectReturnDate(){
        returnDateOpen.click();
        returnDate.click();
        delay(SHORT_DELAY);
    }

    public void submitSearch(){
        buttonSearch.click();
    }

    public void setCloseOverlay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")));
        closeOverlay.click();
    }

    public void checkboxFilterRefundable(){
        checkboxFilter.click();
    }
}
