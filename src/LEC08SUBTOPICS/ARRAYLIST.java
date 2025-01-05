package LEC08SUBTOPICS;

import java.util.ArrayList;

import java.util.Scanner;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> a_list = new ArrayList<>(10);
        Scanner siz = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = siz.nextInt();
        Scanner elem = new Scanner(System.in);
        for (int rows = 0; rows < size ; rows++) {
            System.out.println("enter the element at :"+rows);
            a_list.add(elem.nextInt());
        }
        System.out.println(a_list);

        //both are declaration

        ArrayList<ArrayList<Integer>> name = new ArrayList<>();
        //MULTI DIMENTIONAL

        System.out.println(name);


        for (int i = 0; i < 3; i++) {
            name.add(new ArrayList<>());
        }

        //here starts

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                name.get(i).add(siz.nextInt());
            }
        }
        System.out.println(name);
    }
}
