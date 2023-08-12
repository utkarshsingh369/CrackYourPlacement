package org.utkarsh.u002_Set_Zeroes_End;

import java.util.Arrays;

public class Main {
    static int[] bruteSetZeroesToEnd(int[] arr){
        int temp;
        for (int i=1;i<arr.length;i++){
            while(i>0&&arr[i]!=0&&arr[i-1]==0){
                temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i=i-1;
            }
        }
        return arr;
    }
    static int[] betterSetZeroesToEnd(int[] arr){
        int lastNonZeroIndex=-1, j,temp;
        for(j=0;j<arr.length;j++){
            if(arr[j]!=0){
                temp=arr[j];
                arr[j]=arr[lastNonZeroIndex+1];
                arr[lastNonZeroIndex+1]=temp;
                lastNonZeroIndex+=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,2,0,5,0,0,7};
        System.out.println(Arrays.toString(betterSetZeroesToEnd(arr)));
    }
}
