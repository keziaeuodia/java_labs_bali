package part_03.Exercise_01;

public class Transportation {

    private boolean required;
    private String transMethod;
    private int price;

    public Transportation(boolean required){
    }

    public Transportation(String transMethod){

    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;

    }

    public String getTransMethod() {
        return transMethod;
    }

    public void setTransMethod(String transMethod) {
        this.transMethod = transMethod;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
