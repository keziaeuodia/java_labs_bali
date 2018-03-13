package part_08;
//Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
//generate an error an catch it in the catch block.

import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatch {
    public static void main(String args[]) {
        int array[] = new int[120];

        for (int i=0; i < 120; ++i){
            array [i] = i*3;
        }

        System.out.print("Enter array index 0 - 119: ");

        try {
            Scanner input = new Scanner(System.in);
            byte a = 0;
            a = input.nextByte();
            System.out.println();

            System.out.print("Enter a number to divide content: ");

            int b = input.nextInt();
            System.out.println();

            System.out.println("Before catch statement.");
            System.out.println("\nThe index " + a + " contains " + array[a]);
            System.out.println(array[a] + " divided by " + b + " = " + (array[a] / b));

        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
        } catch (ArithmeticException exc){
            System.out.println("Cannot divide by 0!");
            exc.printStackTrace();
        }
        System.out.println("\nAfter catch statement.");
    }
}
