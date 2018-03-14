package part_11;

import static javafx.scene.input.KeyCode.T;

/**
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

**/


class Array{
    public static void main(String[] args) {

        Integer [] array = {1,2,3};
        String [] sArray = {"Hello", "World"};

        printArray(array);
        printArray(sArray);

    }
    public static <T> void printArray(T[]array){
        for (T i : array){
            System.out.println(i + " ");
        }
    }
}





