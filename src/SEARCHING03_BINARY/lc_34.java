package SEARCHING03_BINARY;

import java.util.Arrays;

public class lc_34 {
    public static void main(String[] args) {
        int[] a = {};
        int target = 2;  // 3,4
        System.out.println(first_element_index(a,target));
        System.out.println(last_element_index(a,target));
        System.out.println(Arrays.toString(searchRange(a,target)));
    }
    static int first_element_index(int[] arr,int t){
        if (arr.length == 0) {
            return -1;
        }
        int s = 0;
        int e = arr.length-1;
        int f_index = -1;
        while (s <= e){
            int m = s + (e-s)/2;
            if (arr[m] > t) {
                e = m-1;
            } else if (arr[m] < t) {
                s = m+1;
            }else {
                f_index = m;
                e = m -1;
            }
        }
        return f_index;
    }
    static int last_element_index(int[] arr,int t){
        if (arr.length == 0) {
            return -1;
        }
        int s = 0;
        int e = arr.length-1;
        int l_index = -1;
        while (s <= e){
            int m = s + (e-s)/2;
            if (arr[m] > t) {
                e = m-1;
            } else if (arr[m] < t) {
                s = m+1;
            }else {
                l_index = m;
                s = m+1;
            }
        }
        return l_index;
    }
    public static int[] searchRange(int[] a, int tar){
        return new int[]{first_element_index(a,tar),last_element_index(a,tar)};
    }
}
