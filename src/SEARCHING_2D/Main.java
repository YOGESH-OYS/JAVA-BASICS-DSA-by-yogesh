package SEARCHING_2D;

import static SEARCHING_2D.Search_Binary_2D.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Search_in_2D(a,37));
//        System.out.println(searchMatrix(a,200));
    }
}
