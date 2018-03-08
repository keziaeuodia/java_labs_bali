package part_03.Exercise_01;

class Accommodation{
    private String hotelName;
    private String location;
    private int numOfPeople;

    public Accommodation(String hotelName, String location){
        this.hotelName = hotelName;
        this.location = location;
    }

    public Accommodation(String hotelName, String location, int numOfPeople){
        this.hotelName = hotelName;
        this.location = location;
        this.numOfPeople = numOfPeople;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
}

