package Challenges.Multithreading;

public class Controller {
    public static void main(String[] args) {

        System.out.println("Main Start");

        String path1 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file1.txt";
        String path2 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file2.txt";
        String path3 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file3.txt";
        String path4 = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file4.txt";

        Multithreading thread1 = new Multithreading("Thread1", path1);
        Multithreading thread2 = new Multithreading("Thread2", path2);
        Multithreading thread3 = new Multithreading("Thread3", path3);
        Multithreading thread4 = new Multithreading("Thread4", path4);

        try{
            thread1.thrd.join();
            thread2.thrd.join();
            thread3.thrd.join();
            thread4.thrd.join();
        }catch (InterruptedException ie){
            System.out.println(ie.toString());
        }

        synchronized (thread4){
            while (thread3.thrd.isAlive()){
                while (thread2.thrd.isAlive()){
                    while (thread1.thrd.isAlive()){

                    }
                }
            }

        }

        do{
            try{
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println(ie.toString());
            }
        }while (thread1.thrd.isAlive() || thread2.thrd.isAlive() || thread3.thrd.isAlive() || thread4.thrd.isAlive());



        System.out.println("Main Ending");

    }
}
