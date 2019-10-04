package leetcode;

// Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
public class Leetcode_59
{
	public int[][] generateMatrix(int n)
	{
		int[][] res = new int[n][n];

		if (n <= 1)
		{
			res[n][n] = n;
			return null;
		}

		int rowBegin = 0;
		int rowEnd = n - 1;
		int columnBegin = 0;
		int columnEnd = n - 1;
		int count = 1;
		while (rowBegin <= rowEnd && columnBegin <= columnEnd && count <= (n * n))
		{
			for (int i = columnBegin; i <= columnEnd; i++)
			{
				res[rowBegin][i] = count;
				count++;
			}

			rowBegin++;

			for (int i = rowBegin; i <= rowEnd; i++)
			{
				res[i][columnEnd] = count;
				count++;
			}

			columnEnd--;

			if (rowBegin <= rowEnd)
			{
				for (int i = columnEnd; i >= columnBegin; i--)
				{
					res[rowEnd][i] = count;
					count++;
				}
			}

			rowEnd--;

			if (columnBegin <= columnEnd)
			{
				for (int i = rowEnd; i >= rowBegin; i--)
				{
					res[i][columnBegin] = count;
					count++;
				}
			}
			columnBegin++;
		}
		return res;
	}
}
