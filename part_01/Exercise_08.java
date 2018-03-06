package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        double r = 3.14;
        double perimeter = (2*r*Math.PI);
        double area = (r*r*Math.PI);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
