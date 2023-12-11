package com.practice.String;

public class StringExample {

    public static String reverseWord(String s){
        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");
        for (String word:words) {
            StringBuilder tmp = new StringBuilder(word);
            tmp.reverse();
            sb.append(tmp);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
