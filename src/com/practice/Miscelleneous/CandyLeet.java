package com.practice.Miscelleneous;

import java.util.Arrays;

public class CandyLeet {

    // T.C - O(3N)
    public static int candy(int[] ratings) {
        int sum = 0;
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = left[i + 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {

            sum += Math.max(left[i], right[i]);
        }
        return sum;

    }

    //Optimised Approach
    public static int candy2(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
        int total = 0;
        for (int candy : candies)
            total += candy;

        return total;
    }



    public static void main(String[] args) {
        int [] ratings = {1,0,2};
        System.out.println(candy2(ratings));
    }
}