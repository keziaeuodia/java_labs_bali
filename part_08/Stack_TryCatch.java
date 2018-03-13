package part_08;

import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] array;
    private int stackTop;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        stackTop = 0;
    }

    public void push(int i) throws StackFullException{
        if (i > array.length) throw new StackFullException(maxSize);
        array[stackTop++] = i;
    }

    public int pop() throws StackEmptyException{
        if (stackTop == 0) throw new StackEmptyException();
        return array[--stackTop];
    }

}

class StackFullException extends ArrayIndexOutOfBoundsException{

    int size;

    StackFullException(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }

}

class StackEmptyException extends Exception{
    @Override
    public String toString() {
        return "\nStack is empty.";
    }
}

class StackDemo{
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        int val = 1;
        try {

            for (int i = 0; i < 20; i++) {
                stack.push(val);
                System.out.print(val + " ");
                val++;
            }
            System.out.println();

        }catch (StackFullException exc){
            System.out.println(exc.toString());;
        }

        try{
            for (int i = 0; i < 20; i++) {
                val = stack.pop();
                System.out.print(val + " ");
            }
        }catch (StackEmptyException exc){
            System.out.println(exc.toString());
        }

    }
}