package SEARCHING01_LINEAR;

public class LINEAR07_2D_ADD {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 5},
                {4 , 6},
                {3 , 1 , 1}
        } ;
        Solution call = new Solution();
        System.out.println(call.maximumWealth(arr));
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result2 = 0 ;
        for (int[] row : accounts) {
            int result1 = 0;
            for (int col : row) {
                result1 += col;
                if (result1 > result2) {
                    result2 = result1;
                }
            }
        }
    return result2;
    }
}