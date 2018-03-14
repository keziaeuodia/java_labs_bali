package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 {

    public static void main(String[] args) {
        Double [] array = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        Integer[] iArray = {1,2,3,4,5};
        System.out.println(sumArray(array));
        System.out.println(sumArray(iArray));

    }

    static <T extends Number> Number sumArray(T [] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        } return sum;

    }


}


