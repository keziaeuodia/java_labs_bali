package part_05.Exercise_03;

import java.util.Scanner;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */
public class Exercise_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        Overload call = new Overload();

        int result1 = call.add(a);
        int result2 = call.add(a,b);
        int result3 = call.add(a,b,c);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
