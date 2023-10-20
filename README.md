# ⏰ Java TimeTraveler Toolkit 📆

This Java project provides a set of functions for performing various date and time calculations using the Java Date/Time API. These functions include:

- `getTodaysDate()`: Returns today's date.
- `getLaterDatebyDays(LocalDate date, int x)`: Returns the date corresponding to x days after the input date.
- `getPreviousDatebyWeeks(LocalDate date, int x)`: Returns the date corresponding to x weeks before the input date.
- `getTimeDifference(LocalDate date1, LocalDate date2)`: Returns the time difference between two input dates in years, months, and days in the format "Year-20:Months-5:Days-1".

## Usage
You can use these date and time functions in your Java projects as follows:

```java
package com.company;

import java.time.LocalDate;

public class JavaTimeTravelerToolkit {
    public static void main(String[] args) {
       // Print today's date
       System.out.println("Today's date is: " + getTodaysDate());

       // Print the date 14 days from today
       System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));

        // Print the date 5 weeks before today
        System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));

        // Calculate and print the time difference between today and June 30, 2031
        System.out.println("The difference between today and June 30, 2031 is: " +
        getTimeDifference(getTodaysDate(), LocalDate.of(2031, 06, 30)));
    }
}
```

## 🧪 Testing
This project includes JUnit 5 tests to ensure the correctness of the date and time functions. You can run the tests using your preferred IDE or build tool.

```java
import com.example.TestDateTimeFunctions;

public class TestMain {
    public static void main(String[] args) {
        TestDateTimeFunctions.runTests();
    }
}
```

## Authored by: [Peter James Salter](https://github.com/PJSalter)

## ✨Happy Coding 🚀