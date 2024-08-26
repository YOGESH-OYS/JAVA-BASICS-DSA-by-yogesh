package LEC05SUBTOPICS;

import java.util.Scanner;

public class LOOPS {
    public static void main(String[] args) {
        //when you don't know how many iteration it will be use while because it only runs when the condition is true
        int i = 0;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        //for loop

        for (int i1 = 0 ; i1 <= 5 ; i1 ++){
            System.out.println(i1);
        }

        //do while (same as the while but the do will execute first before the while condition)

        int i2 = 0;
        do {
            System.out.println(i2);
            i2+=1;
        }
        while (i2 <= 5);

        //switch case

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value between 1 to 3 : ");
        int i3 = input.nextInt();
        switch (i3){
            case 1:
                System.out.println("this is case 1");
                break;

            case 2:
                System.out.println("this is case 2");
                break;

            case 3:
                System.out.println("this is case 3");
                break;

        }

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        boolean con1 = Character.isUpperCase(ch);
        if(con1){
            System.out.println("its upper");
        }
        else {
            System.out.println("its lower");
        }

        // fibonacci

        Scanner a0 = new Scanner(System.in);
        int limit = a0.nextInt();
        int a1 = 0;
        int a2 = 1;
        System.out.println(a1);
        System.out.println(a2);
        int result;
        for (int i4 = 2 ; i4 < limit ; i4++ ){
            result = a1 + a2 ;
            a1 = a2;
            a2 = result;
            System.out.println(result);
        }

        //palindrome or reverse

        Scanner enter = new Scanner(System.in);
        System.out.println("enter the value to be reversed");
        int a3 = enter.nextInt();
        int temp = a3;
        int rev = 0;
        while (a3 > 0){
            int rem = a3 % 10;
            a3 = Math.floorDiv(a3,10);
            rev = rev * 10 + rem ;
        }
        System.out.println(rev);
        if (rev == temp){
            System.out.println("its palindrome too");
        }
    }
}
