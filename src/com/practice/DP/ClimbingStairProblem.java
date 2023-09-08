package com.practice.DP;

import java.util.Arrays;

public class ClimbingStairProblem {

    //Recursion (2^n) ->
    public static  int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);

    }

    //Memorization - O(n)
    public static  int countWaysMemo(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if(ways[n]!= -1){ //already calculted
            return ways[n];
        }
        ways[n] = countWaysMemo(n - 1,ways) + countWaysMemo(n - 2,ways);
        return ways[n];
    }

    //tabulation O(n)
     public static int countWaysTab(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;

        for(int i =1; i<=n; i++){
            if(i==1){
                dp[i] = dp [i-1] + 0 ;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
     }


    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1]; //0,0,0,0,0   by default 0
        Arrays.fill(ways,-1); // [-1,-1,-1,....]
        System.out.println(countWaysMemo(n,ways));
        System.out.println(countWaysTab(n));
    }
}
