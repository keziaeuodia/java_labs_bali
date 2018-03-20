package Challenges.Multithreading;

public class Controller {
    public static void main(String[] args) {

        System.out.println("Main Start");

        String path1 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file1.txt";
        String path2 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file2.txt";
        String path3 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file3.txt";
        String path4 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file4.txt";

        Multithreading thread1 = new Multithreading("Thread1", path1);
        try {
            thread1.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Multithreading thread2 = new Multithreading("Thread2", path2);
        try {
            thread2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Multithreading thread3 = new Multithreading("Thread3", path3);
        try {
            thread3.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Multithreading thread4 = new Multithreading("Thread4", path4);
        try {
            thread4.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main Ending");

    }
}
