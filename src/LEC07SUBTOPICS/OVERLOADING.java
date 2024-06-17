package LEC07SUBTOPICS;

public class OVERLOADING {
    public static void main(String[] args) {
        //functions with the same name are called over loading , but the arguments passed via those will be deciding which to be executed
        fun(51880);
        fun("hello");
        fun(2,7);
    }
    static void  fun(int a){
        System.out.println(a);
    }
    static void fun(int a , int b){
        System.out.println(a+b);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
