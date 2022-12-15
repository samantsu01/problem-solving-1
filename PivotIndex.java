package org.example.ps1;

import java.util.stream.IntStream;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {

        for(int r = IntStream.of(nums).sum(), i = 0, l = 0; i < nums.length; i++){
            r-=nums[i];
            if(r == l){
                return i;
            }
            l +=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1,7,3,6,5,6};
        System.out.println(pivotIndex(array));
    }
}
