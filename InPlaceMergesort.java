package Searching_Sorting;

import java.util.Arrays;

public class InPlaceMergesort {
    public static void main(String[] args) {
        int[] arr={2,3,9,8,6,7,0,72,2,87};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int s,int e){
        if (e - s == 1) {
            return;
        }
        int m=(s+e)/2;

        sort(arr,s,m);
        sort(arr,m,e);

        merge(arr,s,m,e);
    }

    public static void merge(int[] arr, int s ,int m ,int e){
        int i=s;
        int j=m;
        int k=0;
        int[] merged=new int[e-s];
        while(i<m && j<e){
            if(arr[i] < arr[j]){
                merged[k++]=arr[i++];
            }
            else {
                merged[k++]=arr[j++];
            }
        }
        while (i<m){
            merged[k++]=arr[i++];
        }

        while (j<e){
            merged[k++]=arr[j++];
        }

        for (int z=0;z < merged.length;z++){
            arr[s+z]=merged[z];
        }
    }
}
