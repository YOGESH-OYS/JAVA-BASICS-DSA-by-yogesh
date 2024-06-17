package SEARCHING01_LINEAR;

import java.util.Scanner;

public class LINEAR05_2DARRAY {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 3 , 6 , 40 , 91},
                {2 , 5 , 7 , 8 , 40},
                {11 , 43 , 77 , 34 , 40}
        };
        int target = 40;
        search(arr , target);

        System.out.println(maximum(arr));

        Scanner r1 = new Scanner(System.in); //array row size
        System.out.println("Enter the no of row : ");
        int[][] array = new int[r1.nextInt()][];
        element_entry(array);
    }

static void element_entry(int[][] array){
    for (int Rows = 0; Rows < array.length; Rows++) {
        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter the coloum size for " + Rows + " row ");
        int sw = c1.nextInt();
        array[Rows] = new int[sw];  //array of this row size
        for (int Colz = 0; Colz < sw; Colz++) {
            Scanner array_in = new Scanner(System.in);
            System.out.println("Enter the " + Colz + " elements : ");
            array[Rows][Colz] = array_in.nextInt();
        }
    }
    Scanner ne = new Scanner(System.in);
    System.out.println("Enter the target : ");
    search(array , ne.nextInt());
}

    static void search (int[][] array , int target){
        int answer = 0;
        int answer01 = 0 ;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col]==target){
                    answer= col;
                    answer01 = row;
                }
            }
        }
        System.out.println("The value you entered is in the "+answer01+" row and in column "+answer);
    }

    static int maximum(int[][] array){
        int answer = array[0][0];
        for (int[] ints : array) {
            for (int col = 1; col < ints.length; col++) {
                if (answer < ints[col]) {
                    answer = ints[col];
                }
            }
        }
        return answer;
    }
}
