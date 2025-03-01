package Searching_Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,3,9,8,6,7,0,72,2,87};
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=(arr.length)/2;
        int[]l= sort(Arrays.copyOfRange(arr,0,mid));
        int[]r= sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(l,r);
    }
    public static int[] merge(int[]l,int[]r){
        int[]res=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length&&j<r.length){
        if(l[i]<r[j]){
            res[k++]=l[i++];
        }
        else{
            res[k++]=r[j++];
            }
        }
        while(i<l.length){
            res[k++]=l[i++];
        }
        while(j<r.length){
            res[k++]=r[j++];
        }
        return res;
    }
}
