package org.utkarsh.u005_Find_Duplicate;

public class Main {
    static int findDuplicate(int[] nums){
        int slow=nums[0],fast=nums[0];
        do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while (slow!=fast);
        fast=nums[0];
        while(fast!=slow){
            fast=nums[fast];
            slow=nums[slow];
        }
        return fast;
    }
    public static void main(String[] args) {
        int[] arr={2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDuplicate(arr));
    }
}
