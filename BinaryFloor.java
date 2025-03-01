package Searching_Sorting;

public class BinaryFloor {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5,6,7,8,8,9,9,9};
        int target=7;
        System.out.println(binaryCeil(arr,target));
    }

    private static int binaryCeil(int[] arr, int target) {
        //return index of element which the greatest of elemets which is lesser or equal to the target
        //here no need of if condition i.e if given target is lesser than the smallest element of the array coz
        //the high value finally be get reduced to lesser than zero which is -1
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return high;
    }
}
