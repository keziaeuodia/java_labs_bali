package Challenges.IOChallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Refugees<E> {

    public static void main(String[] args) {
        String path = "/home/kezia/Documents/CodingNomads/labs/java_labs_bali/Challenges/IOChallenge/refugees_per_capita.csv";

        ArrayList<RefugeesData> refData = new ArrayList();

        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {

            String sCurrentLine;
            boolean firstline = true;

            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.startsWith(",Year")){
                    if(firstline) {
                        firstline = false;
                        continue;}
                }
//                System.out.println(sCurrentLine);
                String[] data = sCurrentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                RefugeesData obj = new RefugeesData();

                try{
                    obj.setNum(Integer.parseInt(data[0]));
                    obj.setYear(Integer.parseInt(data[1]));
                    obj.setCountry(data[2]);
                    obj.setPopulation(Double.parseDouble(data[3]));
                    obj.setRefugee(Double.parseDouble(data[4]));
                    obj.setRefugeePerCap(Double.parseDouble(data[5]));

                }catch (ArrayIndexOutOfBoundsException ae){
//                    System.out.println(sCurrentLine + "Data is corrupted");
                }catch (NumberFormatException nfe){

                }

                refData.add(obj);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(popByYear(2001, refData));
        System.out.println(popByYear(2005, refData));
        System.out.println(popByCountry("Afghanistan", refData));
        System.out.println(popByCountry("Indonesia", refData));


    }
    public static void totalPop(ArrayList<RefugeesData>arrayList){
        long totalPop = 0;
        for (RefugeesData r : arrayList) {
//            r.toString();
            totalPop += r.getPopulation();
        }

        System.out.println("total Population = " + totalPop);
    }
    public static void defaultValue(String [] array){
        if (array.length < 6){
            for (int i = 0; i < 6; i++) {
                if (array[i] == null) array[i] = "0.0";
            }
        }
    }

    public static void printListByYear(int year, ArrayList<RefugeesData> arrayList){


        for (RefugeesData r: arrayList) {
            if (r.getYear() == year){
                System.out.println(r);
            }
        }

    }

    public static long popByYear(int year, ArrayList<RefugeesData> arrayList){
        long sum = 0;

        for (RefugeesData r: arrayList) {
            if (r.getYear() == year){
                sum += r.getPopulation();
            }

        }
//        System.out.println(sum);
        return sum;
    }
    public static long popByCountry(String country, ArrayList<RefugeesData> arrayList){
        long sum = 0;

        for (RefugeesData r: arrayList) {
            if (r.getCountry().equalsIgnoreCase(country)){
                sum += r.getPopulation();
            }

        }
        return sum;
    }
}
