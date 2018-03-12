package part_06.Exercise_01;


public class Controller {
    public static void main(String[] args) {

        Artcademy cinema = new Artcademy("Cinema");
        Cookville cooking101 = new Cookville();

        String [] volunteers = {"Josue Martinez", "Jennifer Larkin", "Johnny"};
        String [] themes = {"salad", "Indonesian food", "dessert", "food art"};

        cinema.setClassroom("studio 1");
        cinema.setVolunteers(volunteers);

        cooking101.setLocation("J.W. Marriot");
        cooking101.setWeeklyTheme(themes);

        System.out.println("Today's " + cinema.getSubPrograms() + " class will be in " + cinema.getClassroom());
        System.out.println("Please go to " + cooking101.getLocation() + " for cookville this month");
    }
}
