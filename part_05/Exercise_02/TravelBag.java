package part_05.Exercise_02;

import part_05.Exercise_01.DryBags;

public class TravelBag {
    private String color;
    private boolean laptop;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    public boolean isLaptop() {

        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
        if (laptop){
            System.out.println("This backpack can hold a 15\" laptop");
        }else{
            System.out.println("This backpack is not designed to hold a laptop");
        }
    }

}
