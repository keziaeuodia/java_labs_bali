package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9,10};
        printArray(array);
//        arrayRev(array);
//        printArray(array);
        try {
            arraySwap(array, 2, 8); //swap index 2 & index 8 in array, and print it out
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }
    }

    public static <T> void arrayRev(T[]array){
        for (int i = 0; i < (array.length/2); i++) {
            T x = array[i];
            array[i] = array[array.length-(1+i)];
            array[array.length-(1+i)] = x;
        }
    }

    public static <T> void printArray(T[]array){
        for (T i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T> void arraySwap (T[]array, int index1, int index2) throws ArrayIndexOutOfBoundsException{

        if(index1 >= array.length || index2 >= array.length){throw new ArrayIndexOutOfBoundsException();}
        T x = array[index1];
        array[index1] = array[index2];
        array[index2] = x;
        printArray(array);

    }
    
}

