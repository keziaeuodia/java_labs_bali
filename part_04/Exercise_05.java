package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {
        int [] array = new int[10];

        int i;

        for (i = 0; i < 10; i++){
            array[i] = i;
        }

        for (int val : array){
            System.out.print(val + " ");
        }

    }
}