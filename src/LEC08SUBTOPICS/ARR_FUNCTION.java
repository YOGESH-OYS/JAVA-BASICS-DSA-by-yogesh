package LEC08SUBTOPICS;

import java.util.Arrays;
import java.util.Scanner;

public class ARR_FUNCTION {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
//        ARR_FUNCTION j = new ARR_FUNCTION();
//        j.array(arr);                        THE STATIC METHOD IS INDEPENDENT OF OBJECT , SO IT WILL GIVE WARNING BUT WORKS SAME AS array(arr);
        array(arr);
        System.out.println("next modify");
        modify(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void array (int[] num){
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < num.length ; i++){
            num[i]= in.nextInt();
            System.out.print(num[i] + " ");
        }
    }
    static void modify (int[] num){
        Scanner modify = new Scanner(System.in);
        System.out.println("enter the place out of "+ (num.length-1) +" to be modified");
        int k = modify.nextInt();
        System.out.println("enter the number to be replaced");
        int a = modify.nextInt();
        num[k] = a;
        System.out.println(Arrays.toString(num));
    }
}
