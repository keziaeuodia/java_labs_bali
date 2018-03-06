package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        int population, birthrate, deathrate, immigration;

        birthrate = (31556952/6);
        deathrate = (31556952/12);
        immigration = (31556952/40);

        population = (birthrate - deathrate + immigration); //one year population growth

        int currentPop = 380123456;
        int threePop = (currentPop + (3*population));

        System.out.println("U.S Population in the next 3 years is around " + threePop);

    }

}