package SEARCHING_2D;

public class Search_Binary_2D {
    public static int Search_in_2D(int[][] a , int target){
        int row = 0;int col = a[row].length-1;

        while (row < a.length && col >= 0){
            if (a[row][col] > target){
                col--;
            } else if (a[row][col] < target) {
                row++;
            }else {
                return a[row][col];
            }
        }
        return -1;
    }

    public static boolean searchMatrix(int[][] a, int target) {
        int row = 0;int col = a[row].length-1;

        while (row < a.length && col >= 0){
            if (a[row][col] > target){
                col--;
            } else if (a[row][col] < target) {
                row++;
            }else {
                return Binary_Search(a[row],target);
            }
        }
        return false;
    }

    public static boolean Binary_Search(int[] a, int target){
        int start = 0; int end = a.length-1;

        while(start <= end){
            int middle = start + (end - start)/2;
            if(a[middle] < target){
                start = middle+1;
            }else if(a[middle] > target){
                end = middle;
            }else{
                return true;
            }
        }
        return false;
    }
}
