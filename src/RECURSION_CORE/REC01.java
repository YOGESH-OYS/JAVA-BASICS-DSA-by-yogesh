package RECURSION_CORE;

public class REC01 {
    public static void main(String[] args) {
        Numbers(1);
    }

    public static void Numbers(int data){
        if (data > 10){
            return;
        }
        System.out.println(data);
        Numbers(data+1);
    }
}
