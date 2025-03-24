package RECURSION_CORE;

public class REC02 {
    public static void main(String[] args) {
        System.out.println(FibonaciOf(50));
    }

    public static int FibonaciOf(int n){
        if (n < 2){ return n; }
        return FibonaciOf(n-1) + FibonaciOf(n-2);
    }
}