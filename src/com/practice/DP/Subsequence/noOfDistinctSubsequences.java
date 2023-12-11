package com.practice.DP.Subsequence;

import java.util.Arrays;

public class noOfDistinctSubsequences {

    //total subseuence in a string s , n  = 2^n  ,  2^n -1 character ,1 is empty

    int mod = 1000000007;
    int distinctSubsequences(String S){
        int n = S.length();
        long arr[] = new long[26];
        Arrays.fill(arr,-1);

        long ans = 0;
        long diff = 0 ;

        for (int i = 0; i <n ; i++) {
            int x = S.charAt(i)-'a';
            if (i==0){
                ans = 1;
                arr[x] = 1;
                continue;
            }
            diff = 1+ans;

            if(arr[x]==-1) ans = (ans+diff) % mod;
            else ans = (ans +diff-arr[x])%mod;
            arr[x] = diff;

        }
        ans+=1;

        return (int)(ans<0?ans+mod:ans);
    }


}
