package com.practice.Miscelleneous;

public class SticklerThiefGFG {
    public static int FindMaxSum(int arr[], int n)
    {
        int prev = arr[0];
        int pop = 0;
        int max = prev;

        for (int i = 1; i < n ; i++) {
            max = Math.max(prev, pop+arr[i]);
            pop = prev;
            prev = max;

        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {6,5,5,7,4};
        System.out.println(FindMaxSum(arr,5));
    }
}
