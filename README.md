# ⏰ Java TimeTraveler Toolkit 📆

This Java project provides a set of functions for performing various date and time calculations using the Java Date/Time API. These functions include:

- `getTodaysDate()`: Returns today's date.
- `getLaterDatebyDays(LocalDate date, int x)`: Returns the date corresponding to x days after the input date.
- `getPreviousDatebyWeeks(LocalDate date, int x)`: Returns the date corresponding to x weeks before the input date.
- `getTimeDifference(LocalDate date1, LocalDate date2)`: Returns the time difference between two input dates in years, months, and days in the format "Year-20:Months-5:Days-1".

## Usage
You can use these date and time functions in your Java projects as follows:

```agsl
package com.company;

import java.time.LocalDate;

public class JavaTimeTravelerToolkit {
    public static void main(String[] args) {
        // Get today's date
        System.out.println("Today's date is: " + JavaTimeTravelerToolkit.getTodaysDate());

        // Calculate a date 14 days from today
        LocalDate today = JavaTimeTravelerToolkit.getTodaysDate();
        int x = 14;
        System.out.println(x + " days from today is: " + JavaTimeTravelerToolkit.getLaterDatebyDays(today, x));

        // Calculate a date 5 weeks before today
        int weeks = 5;
        System.out.println(weeks + " weeks prior to today was: " + JavaTimeTravelerToolkit.getPreviousDatebyWeeks(today, weeks));

        // Calculate the time difference between today and a specific date
        LocalDate date1 = LocalDate.of(2002, 10, 3);
        LocalDate date2 = LocalDate.of(2012, 10, 7);
        System.out.println("The difference between date1 and date2 is: " + JavaTimeTravelerToolkit.getTimeDifference(date1, date2));
    }
}
```

## Testing
This project includes JUnit 5 tests to ensure the correctness of the date and time functions. You can run the tests using your preferred IDE or build tool.

```agsl
import com.example.TestDateTimeFunctions;

public class TestMain {
    public static void main(String[] args) {
        TestDateTimeFunctions.runTests();
    }
}

```

✨Happy Coding 🚀