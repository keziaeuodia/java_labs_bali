package part_09;

import java.io.*;

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.

    Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01b {
    public static void main(String[] args) throws IOException {

        String inPath = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/part_09_01a.txt";
        String outPath = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/part_09_01b.txt";

        try (FileReader in = new FileReader(inPath); FileWriter out = new FileWriter(outPath)){

            int i;

            while ((i = in.read())  != -1){

                if (i == ' ') {
                    i = '-';
                }

                out.write(i);

            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }

}