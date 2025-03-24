package SEARCHING02_BINARY;

public class Order_Augnostic_B_S {

    //Finding out what type Assending or Desending before target search

    public static void main(String[] args) {
        int[] a = {18,8,7,5,4,1};
        if (a[0] > a[a.length-1]) {
            System.out.println(FindElementDesending(a,7,0));
        }else {
            System.out.println(FindElementAssending(a,5,a.length-1));
        }
    }

    public static int FindElementAssending(int[] arr, int target ,int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int FindElementDesending(int[] arr, int target ,int start){
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                start = mid+1;
            } else if (arr[mid] < target) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
