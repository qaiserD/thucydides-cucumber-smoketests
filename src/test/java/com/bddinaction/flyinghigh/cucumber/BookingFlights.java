package com.bddinaction.flyinghigh.cucumber;

import cucumber.api.CucumberOptions;
import net.thucydides.cucumber.CucumberWithThucydides;
import org.junit.runner.RunWith;

@RunWith(CucumberWithThucydides.class)
@CucumberOptions(features="src/test/resources/features/flights/booking_flights.feature")
public class BookingFlights {}
