package Searching_Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,0,78,65,4,49,99,2};
        for(int i=0;i< arr.length;i++){
            int last= arr.length-1-i;
            int m=maxIndex(arr,last);
            int temp=arr[m];
            arr[m]=arr[last];
            arr[last]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int maxIndex(int[] arr,int last){
        int res=0;
        for (int i =1; i <last; i++) {
            res=arr[res]>arr[i]?res:i;
        }
        return res;
    }
}
