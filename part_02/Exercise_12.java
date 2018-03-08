package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] args) {
        System.out.print("Miles to drive: ");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        System.out.println();
        System.out.print("MPG: ");
        double mpg = scanner.nextDouble();
        System.out.println();
        System.out.print("Fuel price per gallon: ");
        double fuel = scanner.nextDouble();
        System.out.println();

        double cost = (miles/mpg*fuel);

        System.out.println("Cost of fuel: " + cost);
    }
}