package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

public class Exercise_02{
    public static void main(String[] args) {
        int mult1 = 5, mult2 = 6, add1 = 4, add2 = 6;

        int multResult = multiply(mult1,mult2 );
        int addResult = add(add1,add2 );

        System.out.println((multResult+addResult));

    }
    public static int multiply (int a, int b){
        return a * b;
    }
    public static int add (int c, int d){
        return c + d;
    }
}