package com.practice.Array;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true ;
        boolean decreasing = true;

        for(int i =0; i<nums.length-1; i++){
            if( nums[i]>nums[i+1]) increasing = false;
            if( nums[i]<nums[i+1]) decreasing = false;

        }
        if(increasing) return true;
        if(decreasing) return true;
        return false;

    }
}
