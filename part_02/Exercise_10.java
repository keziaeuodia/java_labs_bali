package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++){
            boolean primeNum = true;
            for(int count = 2; count < i; count++){
                if (i%count == 0){
                    primeNum = false;
                }
            }
            if (primeNum){
                System.out.println(i);
            }

        }

    }
}


