package LEC08SUBTOPICS;

import java.util.Arrays;

public class ARRAYSWAP_BYFUNCTION {
    public static void main(String[] args) {
        int[] drr = {1,2,3,4,5};
        reverse(drr);
    }
    static  void reverse (int[] arg){
        int start = 0;
        int end = arg.length-1 ;
        while (start < end){
            swap(arg , start ,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arg));
    }

    static void swap(int[]arg , int a , int b){
        int temp  ;
        temp = arg[a];
        arg[a] = arg[b];
        arg[b] = temp;
    }
}


/*
ANOTHER WAY FOR REVERSE
 static  void reverse (int[] arg){
    int siz = arg.length ;
    int[] srr = new int[siz];
    int k = 0;
    for (int i = arg.length; i > 0 ; --i) {
        srr[k] = arg[i-1];
        k++;
    }
    System.out.println(Arrays.toString(srr));
}
*/
