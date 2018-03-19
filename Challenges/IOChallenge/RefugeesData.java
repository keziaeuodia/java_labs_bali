package Challenges.IOChallenge;

public class RefugeesData <E>{
    int num;
    int year;
    String country;
    double population;
    double refugee;
    double refugeePerCap;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugee() {
        return refugee;
    }

    public void setRefugee(double refugee) {
        this.refugee = refugee;
    }

    public double getRefugeePerCap() {
        return refugeePerCap;
    }

    public void setRefugeePerCap(double refugeePerCap) {
        this.refugeePerCap = refugeePerCap;
    }

    @Override
    public String toString() {
        return "RefugeesData{" +
                "num=" + num +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", refugee=" + refugee +
                ", refugeePerCap=" + refugeePerCap +
                '}';
    }
}
