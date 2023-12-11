package com.practice.Bits;

public class BitOperation {

    public static int firstSetBit(int n){
     if(n==0)return 0;
    int i=1;
        while(n>0 && n%2==0){
        n = n/2;
        i++;
    }
        return i;
}

   public static int getIthBit(int n, int i) {
       int bitMask = 1<<i;
   if((n & bitMask)==0){
        return 0;
   }else {
       return 1;
       }
   }

   public static int setIthBit(int n , int i){
       int bitMask = 1 << i;
       return n | bitMask;
   }
    public static boolean KthBit(int n, int K) {
        int bitMask = 1<<K;
        return (n & bitMask) != 0;
    }




    public static void main(String[] args) {

      // System.out.println(getIthBit(10,3));
       // System.out.println(setIthBit(10,2));
        System.out.println(KthBit(4,0));
    }
}
