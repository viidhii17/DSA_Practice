package com.practice.Miscelleneous;

public class removeColorPieces {
    public boolean winnerOfGame(String colors) {

        boolean result = false;

        int aCount = countConsecutive(colors,'A');
        int bCount = countConsecutive(colors,'B');

        if(aCount>bCount){
            result = true ;
        }
        else{
            result=false;
        }
        return result;
    }

    private int countConsecutive(String s, char ch){
        int c=0;
        int i=1;

        while(i<s.length()-1){
            if(s.charAt(i)==ch && s.charAt(i-1) == s.charAt(i) && s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            i++;
        }
        return c;
    }
}
