package part_06.Exercise_06;

public class FluxAcademy {

    private int numOfStudents;
    private String program; //class of choice
    private String teacher; //teacher who teaches
    private int hoursPerWeek; //the hours per week required by each programs
    private static int maxStudent = 30; //maximum student for the school
    int num;

    FluxAcademy(String program){
        this.program = program;
    }
    FluxAcademy(){}
    FluxAcademy(int numOfStudents){ //takes the number of students attending the class
        this.numOfStudents = numOfStudents;
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

    public static int getMaxStudent() {
        return maxStudent;
    }

    public static void setMaxStudent(int maxStudent) {
        FluxAcademy.maxStudent = maxStudent;
    }

    public void seatRemaining(){
        if (numOfStudents < maxStudent){
            num = maxStudent - numOfStudents;
        }
        System.out.println("There are " + num + " remaining spots in Flux Academy.");
    }
}
