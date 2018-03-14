package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Exercise_02 {
    public static void main(String[] args) throws IOException{
        InputStream in = null;
        BufferedInputStream buff = null;

        try {
            in = new FileInputStream("/home/kezia/Documents/CodingNomads/labs/java_labs_bali/sometext.txt");
            buff = new BufferedInputStream(in);

            while (buff.available() != 0) {
                char c = (char) buff.read();

                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (Exception exc){
            exc.printStackTrace();
        }finally {
            if (in != null) {
                in.close();
            }
            if (buff != null) {
                buff.close();
            }
        }
    }

}
