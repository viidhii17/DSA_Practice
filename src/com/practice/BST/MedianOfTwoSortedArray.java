package com.practice.BST;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n)
            return findMedianSortedArrays(nums2, nums1);

        int left = (m + n + 1) / 2;

        int low = 0, high = m;
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = left - cut1;

            int l1 = (cut1 > 0) ? nums1[cut1 - 1] : Integer.MIN_VALUE;
            int l2 = (cut2 > 0) ? nums2[cut2 - 1] : Integer.MIN_VALUE;
            int r1 = (cut1 < m) ? nums1[cut1] : Integer.MAX_VALUE;
            int r2 = (cut2 < n) ? nums2[cut2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = cut1 - 1;
            else low = cut1 + 1;
        }
        return 0.0;

    }

    public static void main(String[] args) {
        int arr1 [] = {1,3};
        int arr2 [] = {2};

        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    }
