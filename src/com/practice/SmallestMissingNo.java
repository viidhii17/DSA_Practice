package com.practice;

import java.util.Arrays;

public class SmallestMissingNo {

    public static void main(String[] args) {
        int[] arr ={ 0,-10,1,3,-20};
        System.out.println(missingNo(arr,5));
        System.out.println(Arrays.toString(arr));
    }

   public static int missingNo(int arr[], int n) {

        for (int i = 0; i <n ; i++) {
            int CI = arr[i]-1;
            while(arr[i]>0 && arr[i]<n && arr[i]!= arr[CI])
            {
              //  swap(arr[i],arr[CI]);
                int temp = arr[i];
                arr[i]= arr[CI];
                arr[CI]= temp;

                CI = arr[i]-1;

            }

        }

        for (int i = 0; i < n; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }

        }return n+1;


    }

//    public void swap(int i, int i1) {
//
//        int temp = i;
//        i = i1 ;
//        i1 = temp;
//    }

}
