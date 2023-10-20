package com.company;

import java.time.LocalDate;

//JavaTimeTravelerToolkit
public class JavaTimeTravelerToolkit {
    /*
     * Implement a method which returns today's date.
     */
    public static LocalDate getTodaysDate() {
        // using a method to get the official today's date.
        // Getting the current date using the LocalDate.now() method
        LocalDate today = LocalDate.now();
        // print today to the console.
        // System.out.println(today);
        // Returning the current date as the output of the method.
        return today;
    }

    /*
     * Implement the method so that it returns the date x days after
     * the input date.
     */
    public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
        // this will return the outcome of the localDate object within a variable representing the official date of later x days after.
        // use of plusDays() method of the LocalDate class to add x to the input date and assign it all to future days variable.
        LocalDate futureDays = date.plusDays(x);
        // print to console to test solution.
        //System.out.println(futureDays);
        // return the variable futureDays
        return futureDays;
    }

    /*
     * Implementing a method that returns the date x weeks prior to
     * the input date.
     */
    public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
        // Subtracting the input number of weeks from the input date
        // assigning variable to date and subtracting with method minusWeeks() on the x integer.
        LocalDate resultPastDate = date.minusWeeks(x);
        // return declared variable.
        // print test to check method is doing what is needed.
        // System.out.println(resultPastDate);
        return resultPastDate;
    }

    /*
     * Implementing a method to return the time difference between two input dates
     * in terms of years, months, and days.
     * Return the String in the format: "Year-20:Months-5:Days-1"
     */
    public static String getTimeDifference(LocalDate date1, LocalDate date2) {
        // Calculating the difference between the years of the two dates.
        int yearDiff = date2.getYear() - date1.getYear();
        //System.out.println(yearDiff);

        // Calculating the difference between the months of the two dates.
        int monthDiff = date2.getMonthValue() - date1.getMonthValue();
        //System.out.println(monthDiff);

        // calculating the difference between the days of the two dates.
        int dayDiff = date2.getDayOfMonth() - date1.getDayOfMonth();
        //System.out.println(dayDiff);

        // Then adjusting the month difference if the day difference appears as negative.
        if (dayDiff < 0) {
            int borrow = date1.lengthOfMonth();
            dayDiff = (date2.getDayOfMonth() + borrow) - date1.getDayOfMonth();
            monthDiff--;
        }
        //System.out.println(dayDiff);

        // adjust the year difference if the month difference is negative.
        if (monthDiff < 0) {
            monthDiff += 12;
            yearDiff--;
        }

        // now creating a string which will represent the time difference in the required format.
        String timeDiff = "Years-" + yearDiff + ":Months-" + monthDiff + ":Days-" + dayDiff;
        //System.out.println(timeDiff);

        // return the string which represents the time difference.
        return timeDiff;
    }
    public static void main(String[] args) {
        System.out.println("Today's date is: " + getTodaysDate());
        System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
        System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
        System.out.println("The difference between today " +
                "and June 30, 2031 is: " +
                getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
    }
}