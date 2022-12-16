package org.example.ps1;

import java.util.Arrays;
import java.util.stream.IntStream;


public class RunningSum {
    public static int[] runningSum(int[] nums) {

        for(int i = 0 ; i <= nums.length-1 ; i++){
            if(i == 0){
                nums[i] = nums[i];
            }else{
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
