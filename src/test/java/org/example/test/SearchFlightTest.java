package org.example.test;

import org.example.pages.SearchFlightPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFlightTest extends BaseTest{
    @Test(priority = 1, description = "Search flight Bangkok to Singapore (14 Feb - 15 Feb 2024) and Filter Refundable Fares")
    public void stepTestHomepageToFilter (){
        selectFromCity();
        selectDate();
        searchFlight();
        closeOverlayModal();
        checkboxFilterRefundable();
    }

    private void selectFromCity(){
        String expectedCityFrom = "Bangkok";
        String expectedCityTo = "Singapore";

        SearchFlightPage flight = new SearchFlightPage(driver);

        String actualCityFrom = flight.selectCityFrom(expectedCityFrom);
        Assert.assertEquals(actualCityFrom, expectedCityFrom, "From City");

        String actualCityTo = flight.selectCityTo(expectedCityTo);
        Assert.assertEquals(actualCityTo, expectedCityTo, "To City");
    }

    private void selectDate(){
        SearchFlightPage flight = new SearchFlightPage(driver);
        flight.selectDepartureDate();
        flight.selectReturnDate();
    }

    private void searchFlight(){
        SearchFlightPage flight = new SearchFlightPage(driver);
        flight.submitSearch();
    }


    private void closeOverlayModal(){
        SearchFlightPage flight = new SearchFlightPage(driver);
        flight.setCloseOverlay();
    }

    private void checkboxFilterRefundable(){
        SearchFlightPage flight = new SearchFlightPage(driver);
        flight.checkboxFilterRefundable();
    }
}

