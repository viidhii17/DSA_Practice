package com.practice.Miscelleneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaxmSumCombination {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here


        PriorityQueue<Integer> p = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = N - 1; i > N - K; i--) {
            for (int j = N - 1; j > N - K - 1; j--) {
                int sum = A[i] + B[j];
                if (p.size() < K) p.add(sum);
                else {
                    if (p.peek() < sum) {
                        p.remove();
                        p.add(sum);
                    } else break;
                }
            }
        }
        while (p.size() > 0) {
            list.add(0, p.poll());
        }
        return list;
    }
}
