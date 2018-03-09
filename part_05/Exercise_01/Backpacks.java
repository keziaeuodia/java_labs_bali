package part_05.Exercise_01;

class Backpacks {
    private String color;
    private boolean laptop;

    DryBags dryBag = new DryBags();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
