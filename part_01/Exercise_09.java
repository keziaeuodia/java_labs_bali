package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {
        double width = 2.4;
        double height = 6.4;

        double perimeter = ((width+height)*2);
        double area = width*height;

        System.out.println("Perimeter of the rectangle is " + perimeter);
        System.out.println("Area of the rectangle is " + area);
    }
}