package Searching_Sorting;
import java.util.*;
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct]){//tis will handle even duplicate values and sort it in a correct order
                i++;
            }
            /*if(arr[i]==i+1){//this also does cyclic sort but fails with duplicate values
                i++;
            }*/
            else{
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
               // swap(arr,i,arr[i]-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   /* static void swap(int[] arr,int numone ,int numtwo){
        int temp=arr[numone];
        arr[numone]=arr[numtwo];
        arr[numtwo]=temp;
    }*/
}
