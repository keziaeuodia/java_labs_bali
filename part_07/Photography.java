package part_07;

class Photography extends Artventure{
    private String subject;
    private String [] studentsList = {"Lisa", "Solange", "Pierre", "Philippe"};
    private static int duration = 1; //takes duration of class
    private int fee;

    Photography(int numOfStudents){
        super(10);
        super.setNumOfStudents(numOfStudents);
    }

    @Override
    public void printSubprogram() {
        super.setSubPrograms("Photography");
        super.printSubprogram();
    }

    @Override
    public void print(String[] array) {
        System.out.println("\nThose who signed up:");
        super.print(array);
    }

    public void time(int timeStart){ // a method to print the time of class, when it starts, when it ends
        int timeFinish = timeStart + duration;
        System.out.println("Time : " + timeStart + " - " + timeFinish);
    }

    public void workshop(){
        if (getFee() != 0){
            System.out.println("Workshop fee : " + getFee());
        }else{
            System.out.println("This class is free for all students of Artcademy");
        }
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}

