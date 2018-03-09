package part_05.Exercise_07;

public class FluxPrograms {
    private String program; //class of choice
    private String teacher; //teacher who teaches
    private int hoursPerWeek; //the hours per week required by each programs
    private int students; //student per class
    private static int maxStudent; //maximum student for the school

    FluxPrograms(String program){
        this.program = program;
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
        FluxPrograms.maxStudent = maxStudent;
    }
}
