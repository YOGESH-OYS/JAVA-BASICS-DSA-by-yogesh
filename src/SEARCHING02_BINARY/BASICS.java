package SEARCHING02_BINARY;

import java.util.Arrays;

/* USING A BINARY SEARCH METHOD */

public class BASICS {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 5, 8, 11, 6, 1, 32};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        binary(arr);
    }

    static void binary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int len = (start + end) / 2;
        int target = 11;
        System.out.println("end : " + end + ", start : " + start + ", length : " + len+", Target : "+target);
        loopterminator:
        {
            for (int i = 0 ; target >= arr[len] ; i++){ //right
                if (target == arr[len]){
                    System.out.println("Index of target is "+ len);
                    break loopterminator;
                }
                else {
                    start = len;
                    len = (start+end) / 2 ;
                }
            }
            for (int i = 0 ; target <= arr[len] ; i++){ //left
                if (target == arr[len]){
                    System.out.println("Index of target is "+ len);
                    break loopterminator;
                }
                else {
                    end = len;
                    len = (start+end) / 2 ;
                }
            }
        }
    }
}