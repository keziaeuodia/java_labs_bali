package part_05.Exercise_04;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */


public class Exercise_04{
    public static void main(String[] args) {
        Constructors consDemo1 = new Constructors(5);
        Constructors consDemo2 = new Constructors(4, 6.5);
        Constructors consDemo3 = new Constructors(9, 10.5, "bye");
        String word = consDemo3.getWord();
        Double add = consDemo2.addition();
        System.out.println(add);
        System.out.println(word);

    }

}
