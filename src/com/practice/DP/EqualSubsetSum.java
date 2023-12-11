package com.practice.DP;

public class EqualSubsetSum {
    static  int equalPartition(int N, int arr[]){
        int sum = 0 ;
        for (int x: arr) {
            sum = sum +x;
        }
        if(sum%2==1) return 0;
        sum = sum/2;
        int dp[][] = new int[N+1][sum+1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <=N; i++) {
            for (int j = 0; j <=sum ; j++) {
                if(arr[i-1]<=j) dp[i][j] =dp[i-1][j] + dp[i-1][j-arr[i-1]];
                else dp[i][j] = dp[i-1][j];
            }

        }
//        if (dp[N][sum] ==0) return 0 ;
//        return 1;
        return dp[N][sum]!=0?1:0;
    }



    public static void main(String[] args) {
        int [] arr ={1,5,11,5};
        System.out.println(equalPartition(4,arr));
    }
}
