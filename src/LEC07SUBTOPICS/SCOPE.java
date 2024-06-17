package LEC07SUBTOPICS;

public class SCOPE {
    public static void main(String[] args) {
        int a ;
        {
           // int a = 20; cannot initialize
            //BUT CAN BE MODIFIED
            a = 100;
        }
        System.out.println(a);
        enter();//won't change another function
        System.out.println(a);
    }
    //there are 2 variables in 2 different function but same name both cant access each other function
    //THIS IS CALLED FUNCTION SCOPE
    static void enter(){
        int a = 20;
    //Changes done in this function are stays inside this function
        System.out.println(a);
    }
}
