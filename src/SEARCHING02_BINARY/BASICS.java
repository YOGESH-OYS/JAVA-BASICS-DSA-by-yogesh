package SEARCHING02_BINARY;

import java.util.Arrays;

/* USING A BINARY SEARCH METHOD */

public class BASICS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 9, 10, 8, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        binary(arr);
    }

    static void binary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int len = start + (end - start) / 2;
        int target = 4;
        System.out.println("end : " + end + ", start : " + start + ", length : " + len+", Target : "+target);
        loopterminator:
        while (start <= end){
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