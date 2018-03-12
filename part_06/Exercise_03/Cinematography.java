package part_06.Exercise_03;

import part_06.Exercise_03.Artcademy;

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
}
