package com.practice.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum {

    //subsetsum1
    static void funcSubsetSum1(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        funcSubsetSum1(ind + 1, sum + arr.get(ind),arr,N,sumSubset);
        funcSubsetSum1(ind + 1, sum ,arr,N,sumSubset);
    }

   static ArrayList<Integer> subsetSum1(ArrayList<Integer> arr,int N){

        ArrayList<Integer> sumSubset = new ArrayList<>();
        funcSubsetSum1(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    //subsetsum2
    static void funcSubsetSum2(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i <nums.length ; i++) {
            if (i != ind && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            funcSubsetSum2(i + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
        }
    static List<List<Integer>> subsetSum2(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        funcSubsetSum2(0,nums,new ArrayList<>(),ansList);

        return ansList;

    }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        int [] nums = {1,2,2};

        System.out.println(subsetSum1(arr,3));
        System.out.println(subsetSum2(nums));
    }
}
