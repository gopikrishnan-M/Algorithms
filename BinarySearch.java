package Searching_Sorting;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={2,4,3,5,3,9,378,45,34,23,12};
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int key=6;
        int indx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                indx=mid;
                break;
            }
            else if (arr[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println(key+" element is found at index "+indx);
    }
}
