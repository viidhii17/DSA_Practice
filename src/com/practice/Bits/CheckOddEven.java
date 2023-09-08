package com.practice.Bits;

public class CheckOddEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
       if ((n & bitMask) == 0){
           System.out.println("Even");
       } else{
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {

        oddOrEven(7);
    }
}
