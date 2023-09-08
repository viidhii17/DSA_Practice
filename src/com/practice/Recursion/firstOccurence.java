package com.practice.Recursion;

public class firstOccurence {
    public static int firstOcc(int arr[],int key, int i)
    { if(i==arr.length){
        return -1;
    }
        if(arr[i] ==key ){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }
        public static int lastOcc(int arr[],int key, int i) {
            if (i == arr.length) {
                return -1;
            }
            int isFound = lastOcc(arr,key,i+1);
            if (isFound == -1 && arr[i] == key) {
                return i;
            }
            return isFound;

        }


    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,5,4};
        //System.out.println(firstOcc(arr,5,0));
        System.out.println(lastOcc(arr,5,0));
    }
}
