package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */
public class Exercise_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        int count;

        for(count = 0; count<10; count++){
            System.out.println("enter numbers at index " + count + ": ");
            int i = scanner.nextInt();
            array [count]  = i;
        }

        for(count = 1; count < array.length; count+=2){
            System.out.print(array[count] + " ");
        }

        for(count = (array.length-2); count >= 0; count-=2){
            System.out.print(array[count] + " ");
        }
    }
}