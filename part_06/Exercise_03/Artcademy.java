package part_06.Exercise_03;

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
}
