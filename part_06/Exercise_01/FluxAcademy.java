package part_06.Exercise_01;

//Demonstrate inheritance using 1 super class and 2 subclasses. Each class must be in it's own file.

public class FluxAcademy {

    private int numOfStudents;
    private String program; //class of choice
    private String teacher; //teacher who teaches
    private int hoursPerWeek; //the hours per week required by each programs
    private int students; //student per class
    private static int maxStudent; //maximum student for the school

    FluxAcademy(String program){
        this.program = program;
    }


    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public static int getMaxStudent() {
        return maxStudent;
    }

    public static void setMaxStudent(int maxStudent) {
        FluxAcademy.maxStudent = maxStudent;
    }
}
