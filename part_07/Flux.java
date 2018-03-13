package part_07;

class Flux implements Academy{

    private String [] programs = {"Design", "Culinary", "Performing Art"};
    private int numOfStudents;
    private static int maxNum = 30;

    Flux(String program){
        if (program != programs[0] || program != programs[1] || program != programs[2]){
            System.out.println("Not a valid program");
        }
    }
    Flux(int numOfStudents){
        this.numOfStudents = numOfStudents;
    }
    Flux(){}

    @Override
    public String[] programs() {
        return programs;
    }

    @Override
    public int remainingSeats() {
        int remains; //hold the number of remaining seats
        if (numOfStudents < maxNum){
            remains = maxNum - numOfStudents;
        }else {return 0;}
        return remains;
    }

    @Override
    public void memo() {
        System.out.println("Welcome to Flux");
    }

    public void print(String [] array){
        int i = 0;
        for (String x : array){
            System.out.println((i+1) + ". " + x);
            i++;
        }
    }

    public void date (int day, int month, int year){
        System.out.println(day + "." + month + "." + year);
    }

    public int budget (int num){
        return num;
    }

    public String[] getPrograms() {
        return programs;
    }

    public void setPrograms(String[] programs) {
        this.programs = programs;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public static int getMaxNum() {
        return maxNum;
    }

    public static void setMaxNum(int maxNum) {
        Flux.maxNum = maxNum;
    }
}

