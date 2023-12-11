package com.practice.Miscelleneous;

import java.util.HashSet;
import java.util.Set;

public class minDeletionLeet {
    public int minDeletions(String s){
        int deletion = 0 ;
        int[] freq = new int[26];

        for (char c: s.toCharArray()) {
            freq[c-'a']++ ;
        }
        Set<Integer> uniquefrequencies = new HashSet<Integer>();
        for (int count:freq) {
            while(count > 0 && uniquefrequencies.contains(count)){
                deletion++;
                count--;
            }
            uniquefrequencies.add(count);
        }
        return deletion;

    }
}
