package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        String path = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/sometext.txt";

        try {
            in = new BufferedReader(new FileReader(path));

            String l;
            while ((l = in.readLine()) != null) {

                int count = 0;
                int numLoops = l.length();

                while (numLoops > 0) {
                    String character = String.valueOf(l.charAt(count));
                    System.out.print(character);
                    count++;
                    numLoops--;
                }
                System.out.println();
            }
            int c;
            while ((c = in.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (in != null) {
                in.close();
            }

        }

    }
}