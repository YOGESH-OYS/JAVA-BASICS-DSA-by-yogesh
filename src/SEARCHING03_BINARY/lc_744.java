package SEARCHING03_BINARY;

public class lc_744 {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        char[] b = {'c','f','j'};
        char t = 'd';
        System.out.println(greater(b,t));
        System.out.println(nextGreatestLetter(b,t));
    }
    static char greater(char[] arr, char target) {
        if (target >= arr[arr.length-1]) {
            return arr[0];  // target itself is the greatest?
        }
        int start = 0;
        int end = arr.length - 1;
        while (true) {
            int mid = start + (end - start) / 2;
            if (start > end) {
                return arr[start];
            } else if (target >= arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0; int end = letters.length-1 ;
        int middle = 0;

        while(true){
            // FIXING MIDDLE
            middle = start + (end - start)/2;
            // CHECKING THE VALUE FOR CEELING ELEMENT
            if(start > end){ return letters[start]; }
            if(letters[middle] > target){ end = middle-1; }
            else if(letters[middle] < target){ start = middle+1; }
            else{ return letters[middle]; }

        }
    }
}
