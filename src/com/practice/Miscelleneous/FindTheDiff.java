package com.practice.Miscelleneous;

public class FindTheDiff {

    public char findTheDifference(String s, String t) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a']--;
            map[t.charAt(i)-'a']++;
        }
        map[t.charAt(t.length()-1)-'a']++;
        for (int i = 0; i < 26; i++) {
            if (map[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return '1';
    }
}
