package com.practice.String;

public class LongestPalindromicSubsequence {

    public int longestPalinSubseq(String S)
    {
    StringBuilder str = new StringBuilder(S);
    String s1 = S;
    String s2 = str.reverse().toString();
    int n = S.length();
    int dp[][] = new int[n+1][n+1];


        for( int i =0 ; i<=n ;i++)
    {
        for( int j =0; j<=n;j++)
        {
            if(i==0 || j==0)
                dp[i][j] =0;

            else if( s1.charAt(i-1)==s2.charAt(j-1) )
                dp[i][j] = 1+dp[i-1][j-1];

            else
                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
        }
    }

        return dp[n][n];
}

    public String longestPalindrome(String s) {

        if (s == null || s.length() <= 1) return s;
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        String str = String.valueOf(s.charAt(n - 1));
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (i + 1 == j || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    str = str.length() <= (j - i + 1) ? s.substring(i, j + 1) : str;
                }
            }
        }
        return str;
    }
}