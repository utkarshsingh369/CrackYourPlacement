package org.utkarsh.day3.u003_Best_Time_To_Buy_Sell;

public class Main {
    static int findMaxProfit(int[] prices){
        int profit=0,min=prices[0],temp;
        for(int i=1;i<prices.length;i++){
            temp=prices[i]-min;
            profit= Math.max(profit, temp);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(findMaxProfit(arr));
    }
}
