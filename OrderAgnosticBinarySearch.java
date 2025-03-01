package Searching_Sorting;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
       // int[]arr={98,87,76,65,54,43,32,21,12,7,5,3,2};
        int[]arr={1,3,6,8,9,12,13,15,16,19,25,28,37,48,59,69,70,82};

        int low=0;
        int high=arr.length-1;
        int target=12;
        int indx=-1;
        if(arr[0]>arr[high]) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    indx = mid;
                    break;
                } else if (arr[mid] < target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        else{
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    indx = mid;
                    break;
                } else if (arr[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        System.out.println(target+" element is found at index "+indx);
    }
}
