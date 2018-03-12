package part_06.Exercise_04;

public class Controller {

    public static void main(String[] args) {

        Artcademy cinema = new Artcademy("Cinematography");

        String [] volunteers = new String[3];
        volunteers[0] = "David Ingram";
        volunteers[1] = "Tipi Jabrik";
        volunteers[2] = "Lawrence Bolton";

        System.out.println("This month's guest speakers :");
        cinema.print(volunteers);

        System.out.println();

        System.out.print("Those who are listed for ");
        Cinematography story = new Cinematography();
        story.setSubject("Story Telling");
        String [] studentList = {"Cynthia", "Andre", "Steven", "David", "Intan"};
        story.setStudentsList(studentList);
        int i = 0;
        for (String x : studentList){
            System.out.println((i+1) + ". " + x);
            i++;
        }
        System.out.println();
        System.out.println("Today's theme is " + story.getSubject() + " by " + volunteers[2]);

        System.out.print("Brought to you by: ");
        story.hello();

    }
}
