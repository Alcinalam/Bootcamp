package exercise.questions;

import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Input a month number: 2
   * Input a year: 2016
   * February 2016 has 29 days
   * 
   * Input a month number: 12
   * Input a year: 2014
   * December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        monthOfName = "January";
        number_Of_DaysInMonth = 31;
        break;
        // Code here ...
      case 2:
        monthOfName = "February";
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
          number_Of_DaysInMonth = 29;
        } else {
          number_Of_DaysInMonth = 28;
        }
        break;
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
      case 3:
        monthOfName = "March";
        number_Of_DaysInMonth = 31;
        break;
      case 4:
        monthOfName = "April";
        number_Of_DaysInMonth = 30;
        break;
      case 5:
        monthOfName = "May";
        number_Of_DaysInMonth = 31;
        break;
      case 6:
        monthOfName = "June";
        number_Of_DaysInMonth = 30;
        break;
      case 7:
        monthOfName = "July";
        number_Of_DaysInMonth = 31;
        break;
      case 8:
        monthOfName = "August";
        number_Of_DaysInMonth = 31;
        break;
      case 9:
        monthOfName = "September";
        number_Of_DaysInMonth = 30;
        break;
      case 10:
        monthOfName = "October";
        number_Of_DaysInMonth = 31;
        break;
      case 11:
        monthOfName = "November";
        number_Of_DaysInMonth = 30;
        break;
      case 12:
        monthOfName = "December";
        number_Of_DaysInMonth = 31;
    }
    System.out.print(monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
  }
} 

