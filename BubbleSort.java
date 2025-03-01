package Searching_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={2,4,3,5,78,6,54,56,0,44,};
        for (int i = 0; i <arr.length ; i++) {
            for(int j=0;j<arr.length-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
