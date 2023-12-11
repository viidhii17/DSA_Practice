package com.practice.Array;

public class FindDuplicateNo {
    static int findDup(int [] nums){

//        int ans = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            ans = ans^arr[i];
//        }
//        for (int i = 1; i < arr.length ; i++) {
//            ans = ans^i;
//        }
//        return ans;

        int slow =nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast =nums[nums[fast]];

        }while(slow!=fast);

        fast = nums[0];
        while(slow!=fast){
            slow =nums[slow];
            fast = nums[fast];
        }
        return  slow;
    }

    public static void main(String[] args) {
        int [] arr ={ 4,2,1,3,3};
        System.out.println(findDup(arr));
    }

}
