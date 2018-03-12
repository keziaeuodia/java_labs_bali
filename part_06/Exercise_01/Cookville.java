package part_06.Exercise_01;

public class Cookville extends FluxAcademy {

    private int weeklyBudget;
    private String location;
    private String [] weeklyTheme;

    Cookville(){
        super("Cookville");
    }

    public int getWeeklyBudget() {
        return weeklyBudget;
    }

    public void setWeeklyBudget(int weeklyBudget) {
        this.weeklyBudget = weeklyBudget;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String[] getWeeklyTheme() {
        return weeklyTheme;
    }

    public void setWeeklyTheme(String[] weeklyTheme) {
        this.weeklyTheme = weeklyTheme;
    }
}
