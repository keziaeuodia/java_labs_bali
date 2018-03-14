package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_04 {
    public static void main(String[] args) {
        String path = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/sometext.txt";
        File file = new File(path);
        Date date = new Date(file.lastModified());
        System.out.println("Last modified: " + date);
        System.out.println("Access to write: " + file.canWrite());
        file.setReadOnly();
        System.out.println("Changed ");
        System.out.println("Access to write: " + file.canWrite());
        file.setWritable(true);

    }

}








