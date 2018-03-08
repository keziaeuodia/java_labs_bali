package part_03.Exercise_01;

import java.util.Scanner;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/
public class TripController{
    public static void main(String[] args) {

        System.out.println("Thank you for choosing Komodo Trip!\nYou have booked:");

        String hotel = "Ocean View Hotel";
        String destination = "Labuan Bajo";
        boolean transReq = true;


        Accommodation acc = new Accommodation(hotel, destination);
        acc.setNumOfPeople(4);
        System.out.println(acc.getHotelName() + " at " + acc.getLocation());

        Transportation trans = new Transportation(transReq);
        trans.setPrice(150);
        trans.setTransMethod("Boat");

        amount(acc.getNumOfPeople(), trans.getPrice());

    }


    public static void amount(int people, int price){

        System.out.println("The amount you need to pay is $" + people*price);
    }
}
