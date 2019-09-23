package leetcode;
//121. Best Time to Buy and Sell Stock

/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
 */

public class Leetcode_121
{
	// one pass
	public int maxProfit(int[] prices)
	{
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i] < minPrice)
				minPrice = prices[i];
			else if (prices[i] - minPrice > maxProfit)
				maxProfit = prices[i] - minPrice;
		}
		return maxProfit;
	}

	// slow O(n^2)
	public int maxProfit2(int[] prices)
	{
		int mylength = prices.length;
		int profit = Integer.MIN_VALUE;
		for (int i = 0; i < mylength; i++)
		{
			for (int j = i + 1; j < mylength; j++)
			{
				profit = Math.max(profit, prices[j] - prices[i]);
			}
		}

		if (profit >= 0)
		{
			return profit;
		} else
			return 0;
	}

}
