package part_05.Exercise_04;

public class Constructors {
    private int num1;
    private double num2;
    private String word = "hello";

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    Constructors(int num1, double num2, String word){
        this.num1 = num1;
        this.num2 = num2;
        this.word = word;
    }
    Constructors(int num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        double multiply = num1*num2;
        System.out.println(multiply);
    }
    Constructors(int num1){
        this.num1 = num1;
        System.out.println(num1);
    }

    double addition(){
        return num1+num2;
    }

}
