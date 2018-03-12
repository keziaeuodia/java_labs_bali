package part_06.Exercise_05;

public class Cinematography extends Artcademy {

    private String subject;
    private String [] studentsList;
    public static int x, num;

    Cinematography(){
        super("Cinematography");
        System.out.println(getSubPrograms());
    }
    Cinematography(int num){
        super(num);
        Cinematography.num = num;
        super.setNumOfStudents(num);
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

    @Override
    public void memo() {
        System.out.println("Factory of Cinematic Dreams");
    }

    @Override
    public void seatRemaining() {
        if (num <= 8){
            x = 8 - num;
        }
        System.out.println("There are " + x + " remaining spots. Sign up now!");
    }
}
