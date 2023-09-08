package com.practice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GeneratePara {
    public static List<String> generateParantheses(int n){
        if(n<=0)return null ;
        return getAll(n,n,"",new ArrayList<String>());
    }

    public static  List<String> getAll(int left, int right ,String result,List<String> list){
        if(left>0 )
            getAll(left-1,right,result + "(",list);
        if(right>left)
            getAll(left,right-1,result + ")",list);

        if(left==0 && right ==0)
            list.add(result);

        return list;
    }

    public static void main(String[] args) {
        System.out.println(generateParantheses(2));
    }
}
