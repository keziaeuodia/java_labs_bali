package part_10;

public class RunnableClass implements Runnable{
    Thread thrd;

    RunnableClass(String name){
        thrd = new Thread (this, name);
        thrd.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thrd.getName() + "-" + i);
        }
    }
}

class Controller {

    public static void main(String[] args) {
        System.out.println("main starting");

        RunnableClass thread1 = new RunnableClass("Thread 1");
        RunnableClass thread2 = new RunnableClass("Thread 2");
        RunnableClass thread3 = new RunnableClass("Thread 3");

        do {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }while (thread1.thrd.isAlive() || thread2.thrd.isAlive() || thread3.thrd.isAlive());

        thread1.thrd.setPriority(Thread.MAX_PRIORITY);
        thread2.thrd.setPriority(Thread.MIN_PRIORITY);
        thread3.thrd.setPriority(Thread.NORM_PRIORITY);

        System.out.println("main finished");
    }
}