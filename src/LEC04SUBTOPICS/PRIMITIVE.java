package LEC04SUBTOPICS;

import java.util.Scanner;

public class PRIMITIVE {
    public static void main(String[] args) {
        //primitives
        int num = 89;
        char a1 = 'j';
        float a2 = 28.676789f;
        double a3 = 28354.7535;//large decimal number
        long a4 = 1852483543;//large int value
        boolean check = true;//true or false
        Scanner input = new Scanner(System.in);
        System.out.print("enter a value represent your age");
        System.out.println("your age is "+ input.nextInt());
        //non-primitives(Types that can be break into any other form of data)
        String name = "yogesh";
        System.out.println(name);
        System.out.println(num);
        System.out.println(a1);
        System.out.println(a2);
        System.out.format("%.2f",a2);
        System.out.printf("\n%.2f",a2); //printing float value with 2 decimal or as per wish with round off

    }
}
