package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        System.out.print("Pounds: ");
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        System.out.println();
        System.out.println("Kilograms: " + (pounds*0.454));
    }

}