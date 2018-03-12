package part_06.Exercise_05;

public class Controller {

    public static void main(String[] args) {

        Artcademy cinema = new Artcademy("Cinematography");

        String [] volunteers = new String[3];
        volunteers[0] = "David Ingram";
        volunteers[1] = "Tipi Jabrik";
        volunteers[2] = "Lawrence Bolton";

        String [] studentList = {"Cynthia", "Andre", "Steven", "David", "Intan"};

        System.out.println("This month's guest speakers :");
        cinema.print(volunteers);

        System.out.println();

        Cinematography story = new Cinematography(studentList.length);
        System.out.println("Those who signed up ");
        story.setStudentsList(studentList);
        int i = 0;
        for (String x : studentList){
            System.out.println((i+1) + ". " + x);
            i++;
        }
        story.seatRemaining();
        System.out.println();
        story.setSubject("Story Telling");
        System.out.println("This week's theme is " + story.getSubject() + " by " + volunteers[2]);

        System.out.print("Brought to you by: ");
        story.memo();

    }
}
