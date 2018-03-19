package part_10;

public class ExtendsThread extends Thread {

    ExtendsThread(String name){
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "-" + i);
        }
    }
}

class ThreadController{
    public static void main(String[] args) {
        System.out.println("main starting");

        ExtendsThread thread1 = new ExtendsThread("Thread1");
        ExtendsThread thread2 = new ExtendsThread("Thread2");
        ExtendsThread thread3 = new ExtendsThread("Thread3");

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException ie){
            System.out.println(ie.toString());
        }
        System.out.println("main finished");

    }
}