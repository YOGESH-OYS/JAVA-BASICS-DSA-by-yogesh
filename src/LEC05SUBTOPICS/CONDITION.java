package LEC05SUBTOPICS;

import java.util.Scanner;

public class CONDITION {
    public static void main(String[] args){
        /*
        The best way to write an if condition is to write a boolean value for
        the condition and mention the boolean condition in your if statement
         */
        Scanner input = new Scanner(System.in);
        System.out.print("enter a1 : ");
        int a1 = input.nextInt() ;
        System.out.print("enter a2 : ");
        int a2 = input.nextInt() ;
        System.out.print("enter a3 : ");
        int a3 = input.nextInt() ;
        boolean con1 = a1 > a2 && a1 > a3;
        boolean con2 = a2 > a1 && a2 > a3;
        if (con1){
            System.out.println("a1 is greater "+a1);
        } else if (con2) {
            System.out.println("a2 is greater "+a2);
        }
        else {
            System.out.println("a3 is greater "+a3);
        }
    }
}
