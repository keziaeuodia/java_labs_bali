package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {

        System.out.println("Calculate the volume and area of a cylinder");

        System.out.print("Please enter the radius: ");
        Scanner scanner2 = new Scanner(System.in);
        double radius = scanner2.nextDouble();

        System.out.print("Please enter the length: ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();

        System.out.println();

        double areaCirc = (radius*radius*Math.PI); //area of a circle
        double periCirc = (2*radius*Math.PI); //perimeter of a circle
        double areaCyl = ((areaCirc*2) + (periCirc*length)); //area of a cylinder
        double vol = (areaCirc*length); //volume of a cylinder

        System.out.println("The area is: " + areaCyl);
        System.out.println("The volume is: " +vol);

    }

}