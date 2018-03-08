package part_03;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();
        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;
//        System.out.println("total seconds " + totalSeconds);
        // Get the current second within the minute within the hour
        long currentSec = totalSeconds%60;
//        System.out.println("current second " + currentSec);
        // Get total minutes
        long totalMin = totalSeconds/60;
//        System.out.println("total minutes " + totalMin);
        // Get the current minute in the hour
        long currentMin = totalMin%60;
//        System.out.println("current minute " + currentMin);
        // Get the total hours
        long totalHours = totalMin/60;
//        System.out.println("total hours " + totalHours);
        // Get the current hour
        long currentHour = (totalHours%24) + timeZoneChange;
//        System.out.println("current hour " + currentHour);
        // Display results using a 12 hour clock, include AM or PM

        if (currentHour > 12){
            System.out.println((currentHour-12)+":"+currentMin+":"+currentSec);
        }else {
            System.out.println(currentHour+":"+currentMin+":"+currentSec);
        }

    }
}
