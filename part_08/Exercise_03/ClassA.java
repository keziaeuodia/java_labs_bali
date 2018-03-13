package part_08.Exercise_03;

public class ClassA {
    public static void main(String[] args) {
//
        try{
            int c = ClassB.div(5, 3);
            System.out.println(c);
        }catch (ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }

    }
}

class ClassB{
    public static int div(int a, int b){
        if(b == 0) throw new ArithmeticException();
        return a/b;
    }
}