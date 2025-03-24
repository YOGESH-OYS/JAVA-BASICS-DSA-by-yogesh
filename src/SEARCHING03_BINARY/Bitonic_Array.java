package SEARCHING03_BINARY;

public class Bitonic_Array {
    public static void main(String[] args) {
        int[] a = {0,10,5,2};
        int  i = 0;int e = a.length-1;int m = 0;
        while (i != e){
            m = i + (e - i)/2;
            if (a[m] >= a[m+1]){
                e = m;
            } else if (a[m] < a[m+1] ) {
                i = m+1;
            }
        }
        System.out.println(i);
    }
}
