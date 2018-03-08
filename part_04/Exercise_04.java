package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };

        for (int [] val : dataArray){
            for(int x : val){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Max number is: " + getMaxVal(dataArray));
        System.out.println("Min number is: " + getMinVal(dataArray));
    }
    public static int getMaxVal(int [][] arr){
        int max = arr[0][0];
        for (int [] val : arr){
            for (int x : val){
                if (x > max){
                    max = x;
                }
            }
        }
        return max;
    }

    public static int getMinVal(int [][] arr){
        int min = arr[0][0];
        for (int [] val : arr){
            for (int x : val){
                if (x < min){
                    min = x;
                }
            }
        }
        return min;
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array

}