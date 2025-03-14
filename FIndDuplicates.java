package Searching_Sorting;

import java.util.ArrayList;
import java.util.List;

class FIndDuplicates {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(new String(String.valueOf(findDuplicates(arr))));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}