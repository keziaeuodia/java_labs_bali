package part_06.Exercise_03;

public class Controller {

    public static void main(String[] args) {

        Artcademy cinema = new Artcademy("Cinematography");

        String [] volunteers = new String[3];
        volunteers[0] = "David Ingram";
        volunteers[1] = "Tipi Jabrik";
        volunteers[2] = "Lawrence Bolton";

        cinema.setClassroom("studio 1");

        System.out.println("Today's " + cinema.getSubPrograms() + " class will be in " + cinema.getClassroom());
        System.out.print("Those who are listed for ");
        Cinematography story = new Cinematography();
        story.setSubject("Story Telling");
        String [] studentList = {"Cynthia", "Andre", "Steven", "David", "Intan"};
        story.setStudentsList(studentList);
        int i = 0;
        for (String x : studentList){
            System.out.println(studentList[i]);
            i++;
        }
        System.out.println("Today's theme is " + story.getSubject() + " by " + volunteers[2]);

    }
}
