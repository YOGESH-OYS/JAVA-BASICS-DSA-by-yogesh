package LEC08SUBTOPICS;


import java.util.Arrays;
import java.util.Scanner;

public class ARRAY2D {
    public static void main(String[] args) {
        Scanner array_in = new Scanner(System.in);
        Scanner r1 = new Scanner(System.in); //array row size
        System.out.println("Enter the no of row : ");
        int[][] array = new int[r1.nextInt()][];

        //input part

        for (int Rows = 0; Rows < array.length; Rows++) {
            Scanner c1 = new Scanner(System.in);
            System.out.println("Enter the coloum size for " + Rows + " row ");
            int sw = c1.nextInt();
            array[Rows] = new int[sw];  //array of this row size
            for (int Colz = 0; Colz < sw; Colz++) {
                System.out.println("Enter the " + Colz + " elements : ");
                array[Rows][Colz] = array_in.nextInt();
            }
        }

        //output part

        for (int[] ints : array) {                             //arr.length = actual length of row
            //System.out.println(array[Rows].length);         //arr[rows].length = the selected rows column length
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //OUTPUT AS ARRAY

        for (int[] a : array){
            System.out.println(Arrays.toString(a));
        }
    }
}

//        int[][] arra = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9, 0}
//        };
//        for (int[] i : arra) {
//            System.out.println(Arrays.toString(i));
//        }




//ANOTHER WAY OF PRINTING SAME OUTPUT

//            for (int Rows = 0; Rows < array.length; Rows++) {     //arr.length = actual length of row
//                //System.out.println(array[Rows].length);         //arr[rows].length = the selected rows column length
//                for (int Colz = 0; Colz < array[Rows].length; Colz++) {
//                    System.out.print(array[Rows][Colz] + " ");
//                }
//                System.out.println();
//            }

//ANOTHER WAY OF ARRAY (WITHOUT ENHANCED FOR LOOP)


//        for (int a =0 ; a < array.length ; a++){
//int[] a1 = array[a];
//            System.out.println(Arrays.toString(a1));
//        }
