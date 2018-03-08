package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter a number between 1 to 999999999");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num%4 == 0 && num %7 == 0){
                System.out.println("number is divisible by both 4 and 7");
        }
        else if (num%4 == 0 || num %7 == 0){
            if (num%4 == 0 ^ num %7 == 0){
                System.out.println("number is divisible by 4 or 7 exclusively");
            }
            else{
                System.out.println("number is divisible by 4 or 7");
            }
        }
    }



        // use the && operator to see if the user's number is divisible by both 4 and 7


        // use the || operator to see if the user's number is divisible by 4 or 7


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        // print out the results


}


