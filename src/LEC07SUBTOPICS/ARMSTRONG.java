package LEC07SUBTOPICS;

import java.util.Scanner;

public class ARMSTRONG {
    public static void main(String[] args) {
        Scanner ne = new Scanner(System.in);
        System.out.println("Enter number : ");// this part will print whether the number is arms or not
        int k = ne.nextInt();
        System.out.println(arms(k));
        System.out.println("PRINTING ARMS NUMBER BETWEEN 1000 TO 10000");  // from this part will print arms number between 100 and 1000
        for (int i = 1000 ; i < 10000 ; i++){
            if (arms(i)){
                System.out.println(i);
            }
        }
    }
    static  boolean  arms(int x){
        int org = x;
        int result = 0;
        int sum;
        while (x>0){
            int rem = x % 10;
            x = Math.floorDiv(x,10);
            sum = rem*rem*rem*rem ;
            result += sum;
        }
        return result==org;
    }
}
