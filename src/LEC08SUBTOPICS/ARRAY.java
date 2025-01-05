package LEC08SUBTOPICS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[1]);
        Scanner in = new Scanner(System.in);

        for (int i = 0 ; i < arr.length ; i++){
            arr[i]= in.nextInt();
            //System.out.print(arr[i] + " ");
        }
        for (int num : arr){  // NUM REPRESENT THE ELEMENT OF THE ARRAY
            // FOR EVERY ELEMENT {NUM} IN ARRAY PRINT ELEMENT
            System.out.print(num + " ");//" " Gives space between values
        }
        System.out.println(Arrays.toString(arr));//BEST OF ALL 3 METHOD

        //MODIFICATION
            arr[3] = 44;
            System.out.println(Arrays.toString(arr));
    }
}
