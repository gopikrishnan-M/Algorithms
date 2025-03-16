package Searching_Sorting.BinarySearch2D;

import java.util.Arrays;

public class MatrixBSearch {
    public static void main(String[] args) {
        //this is only applicable only to array which has row wise column wise sorted
        //which literally mean every single element in a row+1 is greater than row similarly column
        int[][] matrix={
                {2,3,4, 5, 6 },
                {3,12,14,156,17},
                {5,22,324,626,527},
                {12,23,34,445,856}
        };
        int target=527;
        System.out.println(Arrays.toString(bSearch(matrix,target)));
    }

    private static int[] bSearch(int[][] matrix, int target) {
        int row=0;
        int col= matrix[row].length-1;
        while(row< matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if (target>matrix[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
