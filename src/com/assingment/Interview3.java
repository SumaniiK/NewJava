package com.assingment;

public class Interview3 {
    public static void main(String[] args) {
        int[] nums={1,3,4,3,2};
        System.out.println(duplicate(nums));
    }
    static int duplicate(int[] nums){
        int i=0;
        while(i<nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                   return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
