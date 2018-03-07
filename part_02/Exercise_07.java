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

        int days = 1440;
        int years = 525600;

        if (i < 1440) {
            System.out.println("It is less than a day.");
        }else if (i < 525600){
            System.out.println("It is " + (i/days) + " days.");
        }else if (i >= 525600){
            System.out.println("It is " + (i/years) + " year and " + (i%years/days) + " days.");
        }

    }
}


