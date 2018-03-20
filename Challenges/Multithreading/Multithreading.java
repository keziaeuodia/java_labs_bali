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

    synchronized void readFile(String path){
        try (
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/file5.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)
        ){
            String l;

            while ((l = br.readLine()) != null){
                out.println(l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}