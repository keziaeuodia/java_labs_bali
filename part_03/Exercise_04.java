package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();
        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = (int) (Math.random() * ((2 - 0) + 0));
        //call the getHand method for the playerHand
        String playH = getHand(playerHand);
        //call the getHand method for the computerHand
        String compH = getHand(computerHand);
        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand, playerHand);
        //print out the player hand and computer hand
        System.out.println("Player hand: " + playH + " Computer hand: " + compH);
        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){
        switch (hand){
            case (0):
                return "scissor";
            case (1):
                return "rock";
            case (2):
                return "paper";
        }
        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
    return "";
        //this is a temporary return statement to squash error - you'll need to update
//        return String.valueOf(hand);
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {
        // if it is not a tie, use a switch statement and a turnery operator to determine the winner
        String status;
        if (computer == player){
            status = "You tied!";
            return status;
        }else {
            switch (computer) {
                case (0):
                    status = (player == 1) ? "You won!" : "You lost!";
                    return status;
                case (1):
                    status = (player == 2) ? "You won!" : "You lost!";
                    return status;
                case (2):
                    status = (player == 0) ? "You won!" : "You lost!";
                    return status;
            }

        }
        return "";

    }
}





