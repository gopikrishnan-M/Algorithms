package Searching_Sorting.BinarySearch2D;

import java.util.Arrays;
/*first understand the types of 2d arrays
* fully sorted -we can use start at top rigth corner and c--,r++ to find the target
* row wise sorted(think lik each row is a separately sorted array which are clubed and 0th  column should be sorted i.e vertically )-
* column wise sorted (cols are sorted 1st row is sorted)
* final conclusion
* ✔ Row-wise Sorted Matrix:
Each row is sorted left to right.
First column is sorted top to bottom.

* ✔ Column-wise Sorted Matrix:
Each column is sorted top to bottom.
First row is sorted left to right.*/
public class MatrixSortedBSearch {
    // first try  method 1
    // check method 2
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,14,15,16},
                {21,22,23,25,26},
                {54,55,57,58,59}
        };
        int target=59;
        method1(matrix,target);
        //System.out.println(Arrays.toString(method2(matrix,target)));;
    }

    private static int[] method2(int[][] matrix, int target) {
//        int ans[]={-1,-1};
        int start=0;
        int end=matrix.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int rstart=0;
            int rend=matrix[mid].length-1;
            while(rstart<=rend){
                int rmid=rstart+(rend-rstart)/2;
                if(matrix[mid][rmid]==target){
                    return new int[]{mid,rmid};
                }
                else if(matrix[mid][rmid]<target){
                    rstart=rmid+1;
                }
                else{
                    rend=rmid-1;
                }
            }
            if(matrix[mid][0]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    private static void method1(int[][] matrix, int target) {
        int rowstart=0;
        int rowend=matrix.length-1;
        int[] ans={-1,-1};
        while(rowstart<=rowend){
            int mid=rowstart+(rowend-rowstart)/2;
            Bsearch(matrix[mid],mid,target,ans);
            if(ans[1]==-1){
                if(matrix[mid][0]>target){
                    rowend=mid-1;
                }
                else{
                    rowstart=mid+1;
                }
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    private static void Bsearch(int[] arr, int row, int target,int[] ans) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans[0]=row;
                ans[1]=mid;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
