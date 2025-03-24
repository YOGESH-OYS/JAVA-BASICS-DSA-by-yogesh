package SEARCHING03_BINARY;

public class SearchIn_Bitonic_Array {

    public static void main(String[] args) {
        int[] a = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(a,2));
    }

    public static int peakIndexInMountainArray(int[] a,int target) {
        int  start = 0;int end = a.length-1;int mid = 0;
        while (start != end){
            mid = start + (end - start)/2;
            if (a[mid] >= a[mid+1]){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        return FindElementAssending(a,target,start) != -1 ? FindElementAssending(a,target,start) : FindElementDesending(a,target,start+1);
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
