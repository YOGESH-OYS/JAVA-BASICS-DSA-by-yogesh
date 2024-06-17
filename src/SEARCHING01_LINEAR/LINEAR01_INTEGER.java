package SEARCHING01_LINEAR;

import java.util.Scanner;

public class LINEAR01_INTEGER {
    public static void main(String[] args) {
        while (true) {

            //FOR INTEGERS

            Scanner value = new Scanner(System.in);
            System.out.println("Enter the value to be searched in the array [ Exit enter 101 ] : ");
            int search = value.nextInt();
            if (search == 101) break;
            int[] arr = {1, 3, 5, 7, 9, -5};
            if (search(arr, search) < 0) System.out.println("no value " + search(arr, search));
            else System.out.println("The value that you searched for is in the index " + search(arr, search));
        }
    }
    static int search(int[] array, int tosearch) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]== tosearch){
                return i;
            }
        }
        return -1;
    }
}


