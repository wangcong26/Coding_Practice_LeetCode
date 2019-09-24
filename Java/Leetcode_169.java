package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_169
{
	// method 1
	public int majorityElement1(int[] nums)
	{
		int majorityCount = nums.length / 2;

		for (int num : nums)
		{
			int count = 0;
			for (int elem : nums)
			{
				if (elem == num)
				{
					count += 1;
				}
			}

			if (count > majorityCount)
			{
				return num;
			}

		}

		return -1;
	}

	// method 2
	public int majorityElement(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int length = nums.length / 2;
		for (int num : nums)
		{
			if (map.containsKey(num))
			{
				map.put(num, map.get(num) + 1);
			} else
			{
				map.put(num, 1);
			}
			if (map.get(num) > length)
			{
				return num;
			}
		}
		return 0;
	}

	// method 3
	public int majorityElement3(int[] nums)
	{
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
