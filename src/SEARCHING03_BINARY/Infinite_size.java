package SEARCHING03_BINARY;

public class Infinite_size {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8,9,10,11,22,23,25,27,29,30,31,32,33,34,35,36,37,38,39};
        int t = 36;
        System.out.println(Inf_size(a,t));
    }
    static int Inf_size(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (true) {
            while (start<=end){
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            start = end+1;
            end = start*2 +1;
        }
    }
}


//public class InfiniteArray {
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
//        int target = 10;
//        System.out.println(ans(arr, target));
//    }
//    static int ans(int[] arr, int target) {
//        // first find the range
//        // first start with a box of size 2
//        int start = 0;
//        int end = 1;
//
//        // condition for the target to lie in the range
//        while (target > arr[end]) {
//            int temp = end + 1; // this is my new start
//            // double the box value
//            // end = previous end + sizeofbox*2
//            end = end + (end - start + 1) * 2;
//            start = temp;
//        }
//        return binarySearch(arr, target, start, end);
//
//    }
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // answer found
//                return mid;
//            }
//        }
//        return -1;
//    }
//}