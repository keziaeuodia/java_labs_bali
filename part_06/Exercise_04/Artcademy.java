package part_06.Exercise_04;

public class Artcademy extends FluxAcademy {

    private String [] volunteers;
    private String subPrograms;
    private String classroom;

    Artcademy(String subPrograms){
        super("Artcademy");
        this.subPrograms = subPrograms;
        System.out.print("Artcademy - ");
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
}
