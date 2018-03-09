package part_05.Exercise_07;

public class FluxController {
    public static void main(String[] args) {
        FluxPrograms design = new FluxPrograms("Artcademy");
        FluxPrograms cooking = new FluxPrograms("Cookville");
        FluxPrograms cinema = new FluxPrograms("Cinema");

        design.setTeacher("Mel Jewelrocks");
        cooking.setTeacher("Ruth Sisi");
        cinema.setTeacher("Josue Martinez");

        FluxPrograms.setMaxStudent(40);

        System.out.println("The " + design.getProgram() + " is taught by " + design.getTeacher() + ".");
        System.out.println("The " + cooking.getProgram() + " is taught by " + cooking.getTeacher() + ".");
        System.out.println("The " + cinema.getProgram() + " is taught by " + cinema.getTeacher() + ".\n");
        System.out.println("The maximum number of students is " + FluxPrograms.getMaxStudent());
    }

}
