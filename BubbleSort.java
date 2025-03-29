package Searching_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        boolean flag=false;
        int[]arr={1,2,3,4,9,6,7};
        for (int i = 0; i <arr.length ; i++) {
            flag=false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 flag=true;
             }
            }
            if(!flag)
                break;

        }
        System.out.println(Arrays.toString(arr));
    }
}
