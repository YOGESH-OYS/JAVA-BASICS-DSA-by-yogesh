package LEC06SUBTOPICS;

import java.util.Scanner;

public class SWITCHCASE {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("enter a string");
        String i4 = inputs.nextLine();
        String i5 = i4 ;
        if (i4.equals(i5)){
            System.out.println("its equal");
        }

        Scanner intinput = new Scanner(System.in);
        System.out.print("enter between 1 to 7 :");
        int i3 = intinput.nextInt();

        switch (i3) {
            case 1:
                System.out.println("this is case 1");
                break;
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("this is case 3");
                break;
            case 4:
                System.out.println("this is case 4");
                break;
            case 5:
                System.out.println("this is case 5");
                break;
            case 6:
                System.out.println("this is case 6");
                break;
            case 7:
                System.out.println("this is case 7");
                break;
        }

        switch (i3) {
            case 1 -> System.out.println("this is case 1");
            case 2 -> System.out.println("this is case 2");
            case 3 -> System.out.println("this is case 3");
            case 4 -> System.out.println("this is case 4");
            case 5 -> System.out.println("this is case 5");
            case 6 -> System.out.println("this is case 6");
            case 7 -> System.out.println("this is case 7");
        }

        System.out.print("enter between 1 to 7 :");
        int i6 = intinput.nextInt();
        switch (i6) {
            case 1 , 2 , 3 , 4 , 5  -> System.out.println("week day");
            case 6 , 7 -> System.out.println("week end");
        }

        while (true) {
        Scanner CHAR = new Scanner(System.in);
        System.out.print("enter 1 for dpt enter 2 for class : ");
        int i7 = CHAR.nextInt();
            switch (i7) {
                case 1 -> {
                    Scanner en = new Scanner(System.in);
                    System.out.println("enter the 1 for IT and 2 for AIDS and 3 for CSE");
                    int ans = en.nextInt();
                    switch (ans) {
                        case 1 -> System.out.println("IT department");
                        case 2 -> System.out.println("AIDS department");
                        case 3 -> System.out.println("CSE department");
                    }
                }
                case 2 -> {
                    Scanner in = new Scanner(System.in);
                    System.out.println("enter1 for A , 2 for B");
                    int inn = in.nextInt();
                    switch (inn) {
                        case 1 -> System.out.println("A class");
                        case 2 -> System.out.println("B class");
                    }
                }
            }
        }
    }
}
