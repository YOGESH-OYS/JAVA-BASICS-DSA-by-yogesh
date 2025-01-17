package SEARCHING01_LINEAR;

public class LINEAR06_EVEN_ODD {
    public static void main(String[] args) {
        int[] arr = {-123561, 32, 5123, 735, 4576 , 96 , -3654};
        even(arr);

        //Second method

        System.out.println(nam(arr));

    }
    static void even (int[] array){
        int length;
        for (int i : array) {
            if(i < 0) {
                length = String.valueOf(i * -1).length(); //converting element into a string and checking length
            }
            else {
                length = String.valueOf(i).length();
            }


            if (length % 2 == 0) {
                System.out.println( i + " contains " + length + " digits (even number of digits).");
            }
            else {
                System.out.println( i +" contains "+ String.valueOf(i).length() + " digits (odd number of digits).");
            }
        }
    }




    static int nam(int[] num){
        int count = 0 ;
        for (int from = 0; from < num.length; from++) {
            if (num[from] < 0){   // checks negative
                String h = String.valueOf(num[from] * -1 ); // converting negative to positive
                if (eve(h)) {
                    count++;
                }
            }
            if (num[from] > 0) {  // only positive
                String h = String.valueOf(num[from]);
                if (eve(h)) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean eve(String k){
            int h = k.length();
        return h % 2 == 0;
    }

}

//unit 03 deadlock to memory management

/*package SEARCHING01_LINEAR;

import java.util.Arrays;
import java.util.Scanner;

public class LINEAR06_EVEN_ODD {
    public static void main(String[] args) {
            int[] arr = {123561, 32, 5123, 735, 96};
            String jrr = Arrays.toString(arr);
            System.out.println(jrr);
            Scanner jj = new Scanner(System.in);
            System.out.println("Enter odd 1 and even 2 [enter 0 to exit]: ");
            int g = jj.nextInt();
            even(arr, g);
    }
    static void even (int[] array  , int k){
        String result ;
        for (int i = 0 ;   i < array.length ; i++) {

            if (String.valueOf(array[i]).length() % 2 == 0 && k == 2){
                result = String.valueOf(array[i]);
                System.out.println(result+" contains "+ String.valueOf(array[i]).length() + " digits (even number of digits).");
            }
            if (String.valueOf(array[i]).length() % 2 != 0 && k == 1)System.out.println(array[i] +" contains "+ String.valueOf(array[i]).length() + " digits (odd number of digits).");
        }
    }
}

 */