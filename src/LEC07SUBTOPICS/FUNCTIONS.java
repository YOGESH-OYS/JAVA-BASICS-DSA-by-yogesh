package LEC07SUBTOPICS;

import java.util.Scanner;

public class FUNCTIONS {
    public static void main(String[] args) {// this is actually a function
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two values");
        int i = in.nextByte();
        int j = in.nextByte();
//        CREATING AN OBJECT FOR THE INSTANCE METHOD
        FUNCTIONS s = new FUNCTIONS();
        s.sum(i,j);

//        calling a function by name, SINCE IT IS STATIC (STATIC : BELONGS TO THE CLASS ITSELF)
        sub(i,j);
        swap(i,j);
    }


        // assigning and defining in variable
        // int a,b,c,d;     this is called defining     a=1,b=2           this is called assigning


//    INSTANCE ONLY CALLED BY THE OBJECT


    void sum(int a ,int b){
        int  c ;
        c = a + b;
        System.out.println("The sum is "+c);
    }



//        STATIC FUNCTION


    static void sub(int a , int b){//parameter passing
        int  c ;
        c = a - b;
        System.out.println("the sub is "+c);
    }
    static void swap(int a , int b){
        int temp  ;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
        me j = new me();
        j.gg();
    }
}


//NEW CLASS TO CALL PREVIOUS CLASSES

class me{
    void gg(){

//        STATIC CALLED OUTSIDE ITS CLASS , SO IT NEEDS ITS CLASS AS OBJECT


        FUNCTIONS.swap(1,2);

    }
}
