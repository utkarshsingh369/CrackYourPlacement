package org.utkarsh.day3.u009_Best_Time_To_Buy_Sell_Stock_2;

public class Main {
    static int findMaxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
            profit=(prices[i]>prices[i-1])?(profit+(prices[i]-prices[i-1])):profit;
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8};
        System.out.println(findMaxProfit(arr));
    }
}
