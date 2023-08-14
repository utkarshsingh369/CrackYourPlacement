package org.utkarsh.day3.u006_Sort_Colors;

import java.util.Arrays;

public class Main {
    static int[] sortColors(int[] nums){
        int low=0,mid=0,high=nums.length-1,temp;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else{
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={2,0,1,0,2,1,1,0,0,1,2,2,1,0};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
}
