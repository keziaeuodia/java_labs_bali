package Challenges.Multithreading;

import java.io.*;

public class Multithreading implements Runnable{
    Thread thrd;
    String path;

    Multithreading(String name, String path){
        this.path = path;
        thrd = new Thread(this, name);
        thrd.start();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starts");
        readFile(getPath());
    }


}
