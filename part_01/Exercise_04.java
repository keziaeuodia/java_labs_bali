package part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {

     public static void main(String[] args) {
         System.out.println("a  a*2  a*4");
         int a;
         for (a =1; a<=4; a++){
             int b = a * 2;
             int c = a * 4;

             System.out.println(a + "  " + b + "    " + c);

         }
     }

}

