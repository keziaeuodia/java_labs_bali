package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.print("Measurement in feet: ");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        System.out.println();

        double meters = feet*0.305;
        System.out.println("Measurement in meters: " + meters);

    }

}