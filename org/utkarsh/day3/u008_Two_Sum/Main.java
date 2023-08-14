package org.utkarsh.day3.u008_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static int[] twoSum(int[] nums,int target){
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                ans[0]=map.get(nums[i]);
                ans[1]=i;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15,25,12};
        int target=18;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
