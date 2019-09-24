package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Pascal's Triangle
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class Leetcode_118
{
	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		if (numRows == 0)
		{
			return triangle;
		}

		triangle.add(new ArrayList<>());
		triangle.get(0).add(1); // first row is always 1

		for (int rowNum = 1; rowNum < numRows; rowNum++)
		{
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = triangle.get(rowNum - 1);

			// fill the first element
			row.add(1);

			// fill the middle elements
			for (int j = 1; j < rowNum; j++)
			{
				row.add(prevRow.get(j) + prevRow.get(j - 1));
			}

			// fill the last element
			row.add(1);

			// add row to triangle
			triangle.add(row);
		}

		return triangle;

	}

	public static void main(String[] args)
	{
		Leetcode_118 triangle = new Leetcode_118();
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		output = triangle.generate(5);
		for (List<Integer> list : output)
		{
			System.out.println(list);
		}

	}
}
