package SEARCHING01_LINEAR;

import java.util.Arrays;

public class LINEAR04_MINIMUM {
    public static void main(String[] args) {
        int[] arr = {6 ,4 , 3 , 7 , 9 , 1 , 8 , 5 , 2 };
        System.out.println(minimum(arr));
        System.out.println(minimum01(arr));
    }

    static int minimum(int[] array){
         Arrays.sort(array);
         return array[0];
    }

    static int minimum01(int[] array){
        int answer = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < answer){
                answer=array[i];
            }
        }
    return answer;
    }
}
