package com.practice.Miscelleneous;

public class EquilibriumPointGFG {
//1-based indexing


   // Soln1
    public static int eqbPoint(long arr[],int n){
        if(n==1)return 1;
//        long sum = 0;
//        for(long x :arr){
//            sum+=x;
//        }
//
//        long sum1 = arr[0];
//        sum = sum-arr[0];
//
//        for (int i = 1; i <n ; i++) {
//            sum = sum - arr[i];
//            if(sum == sum1)return i+1;
//            sum1 = sum1 +arr[i];
//
//        }
//        return -1;
        long s1 =arr[0],s2 = arr[n-1];
        int i=1,j=n-2;

        while(i<=j){
            if(s1==s2 && i==j) return i+1;
            if(s1<s2) s1+=arr[i++];
            else s2+=arr[j--];
        }
        return -1;
    }

    public static void main(String[] args) {
        long [] arr = {1,3,5,2,2};
        System.out.println(eqbPoint(arr,5));
    }



}
