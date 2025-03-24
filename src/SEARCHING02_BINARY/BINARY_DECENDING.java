package SEARCHING02_BINARY;

import java.util.Arrays;

public class BINARY_DECENDING {
    public static void main(String[] args) {
        sort arrays = new sort();
        int[] arr = {3,1,9,5,6,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arrays.Decending_Sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 10;
        System.out.println(Decending_Binary_Search(arr,target));
    }

    public static int Decending_Binary_Search(int[] arr,int target){
        int start = 0;int end = arr.length-1;
        while (start < end){
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

class sort{
    public void Decending_Sort(int[] arr){
        int i = 0;
        int j = 0;
        while (i != arr.length-1){
            if (arr[i] < arr[j]) {
                Swap(arr,i,j);
            }
            if (j == arr.length-1) {
                i++;
                j=i;
            }
            j++;
        }
    }

    static void Swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
