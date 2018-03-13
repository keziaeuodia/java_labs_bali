package part_07;

class Artventure extends Flux{
    private String [] volunteers;
    private String subPrograms;
    private String classroom;
    private static int maxNum = 10;

    Artventure(String subPrograms){
        super();
        this.subPrograms = subPrograms;
    }
    Artventure(int numOfStudents){
        super();
        super.setNumOfStudents(numOfStudents);
    }

    @Override
    public int remainingSeats() {
        return maxNum - getNumOfStudents();
    }

    public void printClassroom(String classroom){
        System.out.println("Please go to " + classroom);
    }

    public void printSubprogram(){
        System.out.println("Artventure - " + subPrograms);
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

    public static int getMaxNum() {
        return maxNum;
    }

    public static void setMaxNum(int maxNum) {
        Artventure.maxNum = maxNum;
    }
}

