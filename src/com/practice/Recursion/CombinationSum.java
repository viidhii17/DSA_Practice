package com.practice.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    //Combination SUM 1
    private static void findCombinations(int ind, int [] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind== arr.length){
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1,arr,target,ans,ds);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    //Combination SUM 2 (duplicates not alowed)
    private static void findCombinations2(int ind, int [] arr, int target, List<List<Integer>> ans, List<Integer> ds){
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length ; i++) {
            if(i>ind && arr[i] == arr[i-1] )continue ;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            findCombinations2(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations2(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }


    public static void main(String[] args) {
      // int[] candidates = {2,3,6,7};

       int candidates [] = { 10,1,2,7,6,1,5};
       List <List<Integer>> comb = combinationSum2(candidates,8);
        //  System.out.println(combinationSum(candidates,7));
        System.out.println(comb.toString().replace(","," "));

    }
}
