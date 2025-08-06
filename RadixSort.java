package Searching_Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();

        //counting sort will be done for every single digit for example if there are 3 digit
        // then we will be performing count sort thrice
        for(int exp=1;max/exp>=1;exp*=10){
            countSort(arr,exp);
        }
    }
    public static void countSort(int[] arr,int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];

        Arrays.fill(count,0);
       for(int i=0;i<n;i++){
           count[arr[i]/exp % 10]++;
       }
        System.out.println("Count array for "+exp+": "+Arrays.toString(count));

        for (int i = 1; i < 10; i++) {
            count[i]=count[i]+count[i-1];
        }
        System.out.println("updated count array : "+Arrays.toString(count));

        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp) % 10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(output,0,arr,0,n);
        System.out.println("output array : "+Arrays.toString(output));
    }
}
