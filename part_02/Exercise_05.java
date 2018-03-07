package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

//        String [] words = new String[]{"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};

        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println();

//        if(i > 0 && i <=10){
//                System.out.println(words[i-1]);
//        }

        if(i > 0 && i <= 10){
            if (i == 1){
                System.out.println("ONE");
            }
            if (i == 2){
                System.out.println("TWO");
            }
            if (i == 3){
                System.out.println("THREE");
            }
            if (i == 4){
                System.out.println("FOUR");
            }
            if (i == 5){
                System.out.println("FIVE");
            }
            if (i == 6){
                System.out.println("SIX");
            }
            if (i == 7){
                System.out.println("SEVEN");
            }
            if (i == 8){
                System.out.println("EIGHT");
            }
            if (i == 9){
                System.out.println("NINE");
            }
            if (i == 10){
                System.out.println("TEN");
            }
        }else{
            System.out.println("OTHER");
        }

    }

}

