package leetcode;

import java.util.Arrays;

public class Leetcode_274
{
	public int hIndex1(int[] citations)
	{
		// Sort citations in ascending order
		Arrays.sort(citations);

		int i = 0;

		// loop starting from the last element and moving to the first one, one by one
		while (i < citations.length && citations[citations.length - 1 - i] > i)
		{
			i++;
		}

		return i; // after the while loop, i=i'+1

	}

	// method 2: O(n)
	public int hIndex2(int[] citations)
	{

		int n = citations.length;
		int[] papers = new int[n + 1];

		// count papers for each citation number
		for (int c : citations)
		{
			papers[Math.min(n, c)]++;
		}

		// finding the h-index
		int k = n;
		for (int s = papers[n]; k > s; s += papers[k])
		{
			k--;
		}
		return k;
	}

}
