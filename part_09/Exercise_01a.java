package part_09;

import java.io.*;

public class Exercise_01a {    public static void main(String[] args) throws IOException {

    FileInputStream in = null;
    FileOutputStream out = null;

    String inPath = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/part_09_01a.txt";
    String outPath = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/part_09_01a_copy.txt";

    try {
        in = new FileInputStream(inPath);
        out = new FileOutputStream(outPath);
        int x;
        while ((x = in.read()) != -1) {

            if (x == ' ') {
                x = '-';
            }

            out.write(x);

        }
    }

    finally {
        if (in != null){
            in.close();
        }
        if (out != null){
            out.close();
        }
    }
}

}
