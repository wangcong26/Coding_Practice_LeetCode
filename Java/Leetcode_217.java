package leetcode;

import java.util.HashMap;

//Contain duplicate
public class Leetcode_217
{
	public boolean containsDuplicate(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i]) + 1);
			} else
			{
				map.put(nums[i], 1);
			}
		}

		for (Integer value : map.values())
		{
			if (value > 1)
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		int[] test =
		{ 1, 2, 3, 1 };
		Leetcode_217 contain = new Leetcode_217();
		contain.containsDuplicate(test);
		System.out.println(contain.containsDuplicate(test));

		int[] nums =
		{ 1, 2, 3, 1 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i]) + 1);
			} else
			{
				map.put(nums[i], 1);
			}
		}

		for (Integer value : map.values())
		{
			System.out.println(value);
		}
		System.out.println("---------------");
		for (Integer value : nums)
		{
			System.out.println(value);
		}

	}

}
