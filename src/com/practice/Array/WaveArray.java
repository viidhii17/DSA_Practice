package com.practice.Array;

public class WaveArray {

    public static void convertToWave(int n, int [] a) {
        for (int i = 1; i <n; i+=2){
            int c = a[i];
            a[i] = a[i-1];
            a[i-1]=c;
        }
    }


}
