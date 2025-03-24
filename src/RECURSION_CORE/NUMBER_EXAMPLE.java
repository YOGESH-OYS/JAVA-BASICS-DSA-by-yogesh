package RECURSION_CORE;

public class NUMBER_EXAMPLE {
    public static void main(String[] args) {
        Numbers(1);
    }

    //call stack of function call another function
    public static void Numbers(int n){
        System.out.println(n);
        Numbers2(2);
    }
    public static void Numbers2(int n){
        System.out.println(n);
        Numbers3(3);
    }
    public static void Numbers3(int n){
        System.out.println(n);
        Numbers4(4);
    }
    public static void Numbers4(int n){
        System.out.println(n);
        Numbers5(5);
    }
    public static void Numbers5(int n){
        System.out.println(n);
    }
}
