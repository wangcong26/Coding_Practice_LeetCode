package leetcode;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_229
{
	public List<Integer> majorityElement(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> myList = new ArrayList<>();

		int length = nums.length;
		int times = length / 3;

		for (int i : nums)
		{
			if (map.containsKey(i))
			{
				map.put(i, map.get(i) + 1);
			} else
			{
				map.put(i, 1);
			}
			// System.out.println(map.get(i));
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if (entry.getValue()>times)
				myList.add(entry.getKey());
		}

		return myList;
	}

	public static void main(String[] args)
	{
		Leetcode_229 solution = new Leetcode_229();
		int[] testArray = new int[]
		{ 3, 2, 3 };
		List<Integer> result = new ArrayList<>();
		result = solution.majorityElement(testArray);

		for (int num : result)
		{
			System.out.print(num);
		}

	}
}
