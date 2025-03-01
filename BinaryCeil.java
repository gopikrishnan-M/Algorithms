package Searching_Sorting;

public class BinaryCeil {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5,6,7,7,7,7,8,8,9,9,9};
        int target=7;
        System.out.println(binaryCeil(arr,target));
        System.out.println("we made it");
    }

    private static int binaryCeil(int[] arr, int target) {
       /* return the index of the element which is the smallest number greater
         than or equal to the target element*/
        // finally
        int low=0;
        int high=arr.length-1;
        /*we want to find greater element but if the target is the greatest one then return -1*/
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return low;
    }
}
