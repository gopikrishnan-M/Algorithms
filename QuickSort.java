package Searching_Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,2,1,5,3};
        qSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qSort(int[] arr,int low,int high) {
        if (low >= high) return;
        int s=low;
        int e=high;
        int m=(s+e)/2;
        int pivot=arr[m];
        while(s<=e){
            while (arr[s]< pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            qSort(arr,low,e);
            qSort(arr,s,high);
        }
    }
}
