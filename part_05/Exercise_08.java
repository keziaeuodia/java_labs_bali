package part_05;

/**
 * Write one class. This class must make use of an inner/nested class.
 * Within the nested class, access the instance variables of the outer class.
 * Also, within the inner class, call at least two methods that have a return type of int.
 */
public class Exercise_08{
    int a,b;

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int mult(int num1,int num2){
        return num1*num2;
    }

    public class SimpleMath{
        public int innerMethod(){
            int x = add(a,b);
            int y = mult(a,b );
            return x+y;
        }

    }

    public static void main(String[] args) {
        Exercise_08 obj = new Exercise_08();
        obj.a = obj.b = 10;
        obj.test();

    }

    public void test(){
        SimpleMath sm = new SimpleMath();
        System.out.println(sm.innerMethod());
    }
}