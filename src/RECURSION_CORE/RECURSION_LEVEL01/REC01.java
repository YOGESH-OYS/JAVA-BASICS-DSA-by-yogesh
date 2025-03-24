package RECURSION_CORE.RECURSION_LEVEL01;

public class REC01 {
    public static void main(String[] args) {
        System.out.println(Product(5));
        System.out.println();

        System.out.println(Sum(5));
        System.out.println();

        Forward(0);
        Reverse(0);
        System.out.println();

        System.out.println(SumDigits(1372));
        System.out.println(ProductDigits(1372));
        System.out.println();

        PassingConcept(5);
        System.out.println();

        System.out.println(ReverseDigitsWithVariable(1021));
        System.out.println(Palindrome(1221));
        System.out.println(CountZeros(102030));
    }

    public static int Product(int n){
        if (n == 1){
            return 1;
        }
        return n * Product(n-1);
    }

    public static int Sum(int n){
        if (n < 1){
            return 0;
        }
        return n + Sum(n-1);
    }

    public static void Forward(int n){
        if (n > 5){
            return;
        }
        System.out.println(n);
        Forward(n+1);
    }

    public static void Reverse(int n){
        if (n > 5){
            return;
        }
        Reverse(n+1);
        System.out.println(n);
    }

    public static int SumDigits(int n){
        if (n == 0){ return 0; }
        return n%10 + SumDigits(n/10);
    }

    public static int ProductDigits(int n){
        if (n == 0){ return 1; }
        return n%10 * ProductDigits(n/10);
    }

    public static void PassingConcept(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        //PassingConcept(n--);  // it is similar to for loop where it passes the value first before subracting so, so n-- makes that to pass n= 5 again and again
        PassingConcept(--n);
    }

    private static int Helper(int n,int ans){
        if (n == 0){ return ans; }
        ans = ans*10 + n%10;
        return Helper(n/10,ans);
    }
    public static int ReverseDigitsWithVariable(int n){
        int ans = 0;
        return Helper(n,ans);
    }

    public static boolean Palindrome(int n){
        return n == ReverseDigitsWithVariable(n);
    }

    public static int CountZeros(int n){
        int count = 0;
        return HelperCount(n,count);
    }
    private static int HelperCount(int n,int count){
        if (n%10 == n){ return count; }
        if (n%10 == 0){
            count++;
        }
        return HelperCount(n/10,count);
    }

}
