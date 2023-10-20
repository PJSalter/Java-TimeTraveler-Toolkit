package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
    void getLaterDatebyDays() {
    }

    @org.junit.jupiter.api.Test
    void getPreviousDatebyWeeks() {
    }

    @org.junit.jupiter.api.Test
    void getTimeDifference() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}