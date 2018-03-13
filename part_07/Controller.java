package part_07;

public class Controller {
    public static void main(String[] args) {

        Photography lights = new Photography(10);
        lights.setFee(0);
        lights.workshop();
        lights.printSubprogram();
        lights.time(10);
        lights.print(lights.getStudentsList());
    }

}
