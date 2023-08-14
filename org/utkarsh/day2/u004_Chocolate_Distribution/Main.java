package org.utkarsh.day2.u004_Chocolate_Distribution;

import java.util.Arrays;

public class Main {
    static int distributeChocolate(int[] arr,int n,int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=(n-m);i++){
            if((arr[i+m-1]-arr[i])<min){
                min=arr[i+m-1]-arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        int n=arr.length;
        int m=3;
        System.out.println(distributeChocolate(arr,n,m));
    }
}
