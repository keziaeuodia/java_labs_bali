package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        double  a, b, c, d, pi;
        double sum = 0;
        double sum2 = 0;

        for (a = 1; a<=11; a+=4){
            c = (4 * (1/a));
            sum+=c;
        }

        for (b = 3; b <= 11; b+=4){
            d = (4 * (-1/b));
            sum2+=d;
        }
        pi = sum+sum2;

        System.out.println(pi);


    }

}