package part_04;


import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */
class Stack {
    private int maxSize;
    private char[] array;
    private int stackTop;

    private Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new char[maxSize];
        stackTop = 0;
    }
    private void push(char ch) {
        array[stackTop++] = ch;
    }
    private char pop() {
        return array[--stackTop];
    }

    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 26: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        char ch ='a';
        for (int i = 0; i < size; i++){
            stack.push(ch);
            System.out.print(ch + " ");
            ch++;
        }

        ch = stack.pop();
        System.out.println("\n" + ch);

    }

}