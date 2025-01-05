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
        Row_maximum(arr);
        System.out.println(maximum(arr));

        Scanner r1 = new Scanner(System.in); //array row size
        System.out.println("Enter the no of row : ");
        int[][] array = new int[r1.nextInt()][];
        element_entry(array);
        Row_maximum(array);
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

    static void Row_maximum(int[][] array){
        // length will be 3 since I need every maximum element if every row wise
        int[] max_elements = new int[array.length];
        int max_element_index = 0;
        for(int[] a : array){
            int max = 0;
            for (int i : a) {
                if (i > max) {
                    max = i;
                }
            }
            max_elements[max_element_index] = max;
            max_element_index++;
        }

        for (int i = 0; i < max_elements.length; i++) {
            System.out.println("the maximum value of "+i+" rows is "+max_elements[i]);
        }

    }
}
