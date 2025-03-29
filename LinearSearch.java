package Searching_Sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={3,6,3,6,8,9,7,5,44,66,88,54,4,56,7,5,4};
        int target=7;
        System.out.println(linearSearch(arr,target));
    }

    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(target==arr[i])
                return i;
        }
        return -1;

    }
}
