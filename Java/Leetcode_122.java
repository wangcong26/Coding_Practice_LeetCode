package leetcode;

public class Leetcode_122
{
	public int maxProfit(int[] prices)
	{
		// If prices is empty, return 0
        if (prices.length==0)
            return 0;
        
		int i = 0;
		int valley = prices[0];
		int peak = prices[0];
		int maxprofit = 0;
		while (i < prices.length - 1)
		{
			// To find the valley place, current price > next price. If not, move the pointer to the next.
			while (i < prices.length - 1 && prices[i] >= prices[i + 1])
				i++;
			valley = prices[i];
			
			// To find peak place, current price < next price. If not, move the pointer to the next.
			while (i < prices.length - 1 && prices[i] <= prices[i + 1])
				i++;
			peak = prices[i];
			maxprofit += peak - valley;
		}
		return maxprofit;
	}

}
