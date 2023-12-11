package com.practice.BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastOccurence {
    public static int solve(int n, int key, int[] v) {
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v[mid] == key) {
                res = mid;
                start = mid + 1;

            } else if (key < v[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    public static int[] solve2( int target, int[] nums) {
        int[] res = new int[]{-1,-1};
        if(nums.length == 0) return res;
        int start = 0;
        int end = nums.length - 1;
        // int res = -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            }  else   start = mid + 1;
        }
        if(nums[start]!= target){return res;}
        res[0] = start;
        end = nums.length;
        while(start<end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        res[1] = start -1;
        return res;
}

    static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int li = bs1(arr,0,n-1,x);
        int ri = bs2(arr,0,n-1,x);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(li,ri));
        return list;
    }
    static int bs1(int arr[], int l, int r, int x){
        int res = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]<x)l = m+1;
            else{
                if(arr[m] == x) res = m;
                r =m-1;
            }
        }
        return res;
    }
    static int bs2(int arr[], int l, int r, int x){
        int res = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]>x)r = m-1;
            else{
                if(arr[m] == x) res = m;
                l =m+1;
            }
        }
        return res;
    }


    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};

        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(solve(n, key, v));
        System.out.println(solve2( key, v));
    }
}
