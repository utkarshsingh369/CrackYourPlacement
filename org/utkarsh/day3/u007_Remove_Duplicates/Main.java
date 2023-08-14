package org.utkarsh.day3.u007_Remove_Duplicates;

import java.util.Arrays;

public class Main {
    static int removeDuplicates(int[] nums){
        int currentNum=nums[0],k=1;
        for(int i=0;i<nums.length;i++){
            if (nums[i] != currentNum) {
                nums[k]=nums[i];
                k += 1;
                currentNum = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,4,4,4,4,5,5,6};
        System.out.println(Arrays.toString(arr)+" & k = "+removeDuplicates(arr));
    }
}
