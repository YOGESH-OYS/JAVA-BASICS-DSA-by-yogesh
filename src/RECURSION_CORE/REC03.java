package RECURSION_CORE;

public class REC03 {
    public static void main(String[] args) {
        int[] a = {2,6,8,11,16,22,48,50,71};
        System.out.println(Binary(a,6));
        System.out.println(BinarySearch02(a,6,0,a.length-1));
    }

    public static int Binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        return BinarySearch(arr,target,start,end);
    }


    //easy
    public static int BinarySearch(int[] arr,int target,int start,int end){
        int middle = start+ (end - start)/2;
        if (arr[middle] == target){
            return middle;
        }
        if (arr[middle] > target){
            end = middle-1;
        }
        if (arr[middle] < target){
            start = middle+1;
        }

        return BinarySearch(arr,target,start,end);
    }

    //simplified
    public static int BinarySearch02(int[] arr,int target,int start,int end){
        int middle = start+ (end - start)/2;
        if (arr[middle] == target){
            return middle;
        }
        if (arr[middle] > target){
            return BinarySearch(arr,target,start,middle-1);
        }

        return BinarySearch(arr,target,middle+1,end);
    }
}
