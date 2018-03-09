package part_05.Exercise_03;

public class Overload {

    int a, b, c;

    public int add(int a){
        b = 0;
        c = 0;
        return a+b+c;
    }

    public int add(int a, int b){
        c = 0;
        return a+b+c;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

}
