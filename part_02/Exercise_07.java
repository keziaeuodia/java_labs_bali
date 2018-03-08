package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        System.out.print("Minutes: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println();

        int days = 60*24;
        int years = days*365;

        if (i < days) {
            System.out.println("It is less than a day.");
        }else if (i < years){
            System.out.println("It is " + (i/days) + " days.");
        }else if (i >= years){
            System.out.println("It is " + (i/years) + " year and " + (i%years/days) + " days.");
        }

    }
}


