package com.practice.DP;

public class CombinationSum4 {

    public static int combinationSum4(int[] nums, int target){
    int[] f = new int[target + 1];
    f[0] = 1;
        for (int i = 1; i <= target; ++i) {
        for (int x : nums) {
            if (i >= x) {
                f[i] += f[i - x];
            }
        }
    }
        return f[target];
}


    public static void main(String[] args) {
        int[] num ={ 1,2,3};
        System.out.println(combinationSum4(num,4));



    }
}
