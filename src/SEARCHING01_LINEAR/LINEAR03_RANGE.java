package SEARCHING01_LINEAR;

import java.util.Scanner;

public class LINEAR03_RANGE {
    public static void main(String[] args) {
        while (true){

            //FOR STRING

            Scanner value = new Scanner(System.in);
            Scanner start = new Scanner(System.in);
            System.out.println("Enter the starting and ending range with space : ");
            int srt = start.nextInt();
            int end = start.nextInt();
            System.out.println("Enter the element to be searched in the array [ Exit enter Esc ] : ");
            String search = value.next();
            if (search.equals("Esc")) break;
            String str = "yogesh";
            System.out.println(st_search(str , search , srt ,end));
        }

        while (true) {

            //FOR INTEGERS

            Scanner start = new Scanner(System.in);
            System.out.println("Enter the starting and ending range with space : ");
            int srt = start.nextInt();
            int end = start.nextInt();
            Scanner value = new Scanner(System.in);
            System.out.println("Enter the value to be searched in the array [ Exit enter 101 ] : ");
            int search = value.nextInt();
            if (search == 101) break;
            int[] arr = {1, 3, 5, 7, 9, -5};
            if (search(arr, search ,srt ,end) < 0) System.out.println("no value " + search(arr, search, srt, end));
            else System.out.println("The value that you searched for is in the index " + search(arr, search, srt, end));
        }
    }
    static String st_search(String var , String tosearch , int start , int end){
        if (var.isEmpty()) System.out.println("is empty");
        for (int i = start; i < end+1 ; i++) {
            if (tosearch.charAt(0) == var.charAt(i)){
                return ("the element entered index is "+ i );
            }
        }
        return ("YOU ENTERED WRONG ELEMENT");
    }

    static int search(int[] array, int tosearch, int start , int end) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (array[i]== tosearch){
                return i;
            }
        }
        return -1;
    }

}
