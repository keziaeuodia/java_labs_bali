package part_06.Exercise_04;

public class Cinematography extends Artcademy {

    private String subject;
    private String [] studentsList;

    Cinematography(){
        super("Cinematography");
        System.out.println(getSubPrograms());
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(String[] studentsList) {
        this.studentsList = studentsList;
    }

    public void hello(){
        System.out.println("Factory of Cinematic Dreams");
    }
}
