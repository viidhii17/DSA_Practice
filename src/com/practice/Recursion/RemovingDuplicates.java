package com.practice.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemovingDuplicates {

    public static void removeDuplicates(String str , int idx, StringBuilder newStr, boolean map[]){

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar- 'a']== true){
            removeDuplicates(str,idx+1, newStr, map);

        }else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1,newStr.append(currChar),map);
        }
    }
    public static String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();
        int freq[] = new int[26];
        boolean exist[] = new boolean[26];

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            freq[ch- 'a']++ ;

        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch- 'a']--;
            if(exist[ch-'a'])continue;

            while(st.size() > 0 && st.peek() >ch && freq[st.peek()-'a']>0){
                char rem =st.pop();
                exist[rem-'a'] = false ;
            }
            st.push(ch);
            exist[ch- 'a'] = true;
        }

        char ans[] = new char[st.size()];
        int i = ans.length-1;
        while(i>=0) ans[i--] = st.pop();
        return new String(ans);
    }



    public static void main(String[] args) throws IOException {
        String str = "apnnnacollege";
      //  removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = removeDuplicates(read.readLine());
        System.out.println(result);
    }
}
