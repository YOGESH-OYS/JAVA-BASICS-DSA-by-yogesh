package SEARCHING02_BINARY;

import java.util.Arrays;


//ASSCENDING ORDER
public class BINARY01_MIDDLE_ELEM {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Arrays.sort(arr);
        int target = 1;
        System.out.println(greater(arr, target));
    }

    static int greater(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
}
