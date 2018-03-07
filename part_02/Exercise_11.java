
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        System.out.print("Investment amount: ");
        Scanner scanner1 = new Scanner(System.in);
        double invAmount = scanner1.nextDouble();
        System.out.println();
        System.out.print("Interest rate in percentage: ");
        Scanner scanner2 = new Scanner(System.in);
        double interest = scanner2.nextDouble();
        System.out.println();
        System.out.print("Years to invest: ");
        Scanner scanner3 = new Scanner(System.in);
        int years = scanner3.nextInt();
        System.out.println();

        double invVal = (invAmount*Math.pow((1+(interest/100)),years));

        System.out.print("Investment value: " + invVal);

    }
}


