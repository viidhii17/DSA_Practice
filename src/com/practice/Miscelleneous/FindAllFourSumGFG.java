package com.practice.Miscelleneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindAllFourSumGFG {

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);

        int n = arr.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Approach 1 -bt hashset takes extra space tc - N^3
        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                int s = j+1, t = n-1;

                while(s<t){
                    int sum = arr[i]+arr[j]+arr[s]+arr[t];
                    if(sum==k){
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[s],arr[t]));
                        if(!hs.contains(l)){
                            list.add(l);
                            hs.add(l);
                        }
                        s++;t--;
                    }else if (sum<k) s++;
                    else t--;
                }


            }

        }

//Approach 2
//        for (int i = 0; i < n; i++) {
//            if(i!= 0 && arr[i]== arr[i-1])continue;
//            for (int j = i+1; j <n ; j++) {
//                if(j!= i+1 && arr[j]== arr[j-1])continue;
//                int s = j+1, t = n-1;
//
//                while(s<t){
//                    int sum = arr[i]+arr[j]+arr[s]+arr[t];
//                    if(sum==k){
//                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[s],arr[t]));
//                        list.add(l);
//                        s++;t--;
//                        while( s<t && arr[s]== arr[s-1])s++;
//                        while( s<t && arr[t]== arr[t+1])t--;
//
//                    }else if (sum<k) s++;
//                    else t--;
//                }
//
//
//            }
//
//        }

        return list;
    }

    public static void main(String[] args) {
        int []arr = {0,0,2,1,1};
        System.out.println(fourSum(arr,3));
    }
}
