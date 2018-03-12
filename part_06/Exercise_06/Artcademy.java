package part_06.Exercise_06;

public class Artcademy extends FluxAcademy {

    private String [] volunteers;
    private String subPrograms;
    private String classroom;
    private int numOfStudents;

    Artcademy(String subPrograms){
        super("Artcademy");
        this.subPrograms = subPrograms;
        System.out.print("Artcademy - ");
    }

    Artcademy(int numOfStudents){
        super(numOfStudents);
        this.numOfStudents = numOfStudents;
    }

    public String[] getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(String[] volunteers) {
        this.volunteers = volunteers;
    }

    public String getSubPrograms() {
        return subPrograms;
    }

    public void setSubPrograms(String subPrograms) {
        this.subPrograms = subPrograms;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void print(String [] volunteers){
        this.volunteers = volunteers;
        int i = 0;
        for (String x : volunteers){
            System.out.println((i+1) + ". " + x);
            i++;
        }
    }

    public void memo(){
        System.out.println("Have Fun!");
    }

    @Override
    public void seatRemaining() {
        if (numOfStudents < 15){
            num = 15 - numOfStudents;
        }
        System.out.println("There are " + num + " remaining spots in Artcademy.");
    }
}
