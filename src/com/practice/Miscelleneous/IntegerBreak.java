package com.practice.Miscelleneous;

import java.util.HashMap;
import java.util.Map;

public class IntegerBreak {

    private Map<Integer, Integer> mem = new HashMap<>();
    public int integerBreak(int n) {

        if (n == 2 || n == 3) {
            return n - 1;
        } else {
            return dfs(n);
        }
    }

    private int dfs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (mem.containsKey(n)) {
            return mem.get(n);
        }

        int max = n;
        // Do DFS (1~n/2)
        for (int i = 1; i <= n / 2; i++) {
            max = Math.max(max, i * dfs(n - i));
        }
        // Make a record
        mem.put(n, max);
        return max;
    }

}
