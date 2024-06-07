
package vu.leapmonths;

import java.util.InputMismatchException;
import java.util.Scanner;



public class LeapMonths {


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    
    public static boolean isLeapMonths(int year, int month) {
        return (month == 2) && isLeapYear(year);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int year = 0;
            int month = 0;
            
            while (true) {
                System.out.print("Enter year: ");
                try {
                    year = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer for the year.");
                    scanner.next();
                } 
            }
            
            while (true) {
                System.out.print("Enter month (1-12): ");
                try {
                    month = scanner.nextInt();
                    if (month >= 1 && month <= 12) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a month between 1 and 12.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer for the month.");
                    scanner.next();
                }
            }
            
            boolean result = isLeapMonths(year, month);
            
            if (result) {
                System.out.println("The month " + month + " in year " + year + " is a leap month.");
            } else {
                System.out.println("The month " + month + " in year " + year + " is not a leap month.");
            }
        }
    }
}
 

