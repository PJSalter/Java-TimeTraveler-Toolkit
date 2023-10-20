package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Java Time Traveler Toolkit functionality for Date and Time")
class JavaTimeTravelerToolkitTest {
    @org.junit.jupiter.api.Test
    @DisplayName("Positive Test case - Check whether function returns today's date successfully")
    public void getTodaysDate() {
        LocalDate expected = LocalDate.now();
        LocalDate actual = JavaTimeTravelerToolkit.getTodaysDate();
        Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Positive Test case - Check whether function returns later date successfully")
    void getLaterDatebyDays() {
        int laterdays = 10;
        LocalDate today = LocalDate.now();
        LocalDate actual = JavaTimeTravelerToolkit.getLaterDatebyDays(today,laterdays);
        Assertions.assertEquals(today.plusDays(laterdays),actual);

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Positive Test case - Check whether function returns previous date successfully")
    void getPreviousDatebyWeeks() {
        int prevweeks = 15;
        LocalDate today = LocalDate.now();
        LocalDate actual = JavaTimeTravelerToolkit.getPreviousDatebyWeeks(today,prevweeks);
        Assertions.assertEquals(today.minusWeeks(prevweeks),actual);

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Positive Test case - Check whether function returns date difference accurately")
    void getTimeDifference() {
        LocalDate date1 = LocalDate.of(2002, 10, 3);
        LocalDate date2 = LocalDate.of(2012, 10, 7);
        LocalDate today = LocalDate.now();
        String actual = JavaTimeTravelerToolkit.getTimeDifference(date1, date2);
        //System.out.println(actual);
        Assertions.assertEquals("Years-10:Months-0:Days-4",actual);

    }
}