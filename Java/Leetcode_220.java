package leetcode;

import java.util.HashMap;
import java.util.TreeSet;

public class Leetcode_220
{
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{
		int length = nums.length;
		for (int i = 0; i < length; i++)
		{
			for (int j = i + 1; j < length; j++)
			{
				if (Math.abs(Long.valueOf(nums[i]) - Long.valueOf(nums[j])) <= t && Math.abs(i - j) <= k)
				{
					System.out.println(Math.abs(nums[i] - nums[j]));
					System.out.println(Math.abs(i - j));
					return true;
				}

			}
		}
		return false;
	}

	// Use balanced tree
	public boolean containsNearbyAlmostDuplicate2(int[] nums, int k, int t)
	{
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < nums.length; ++i)
		{
			// Find the successor of current element
			Integer s = set.ceiling(nums[i]);
			if (s != null && s <= nums[i] + t)
				return true;

			// Find the predecessor of current element
			Integer g = set.floor(nums[i]);
			if (g != null && nums[i] <= g + t)
				return true;

			set.add(nums[i]);
			if (set.size() > k)
			{
				set.remove(nums[i - k]);
			}
		}
		return false;
	}

	// Use bucket method
	public boolean containsNearbyAlmostDuplicate3(int[] nums, int k, int t)
	{
		if (nums == null || nums.length == 0 || k <= 0 || t < 0)
		{
			return false;
		}

		int min = Integer.MAX_VALUE;
		for (int num : nums)
		{
			min = Math.min(num, min);
		}

		HashMap<Long, Integer> bucket = new HashMap<Long, Integer>();
		long diff = Long.valueOf(t) + 1;

		for (int i = 0; i < nums.length; i++)
		{
			// compute the bucket index
			long index = (Long.valueOf(nums[i]) - Long.valueOf(min)) / diff;

			// check left bucket
			Integer left_bucket = bucket.get(index - 1);
			if (left_bucket != null && Math.abs(Long.valueOf(nums[i]) - Long.valueOf(left_bucket)) < diff)
			{
				return true;
			}

			// check right bucket
			Integer right_bucket = bucket.get(index + 1);
			if (right_bucket != null && Math.abs(Long.valueOf(nums[i]) - Long.valueOf(left_bucket)) < diff)
			{
				return true;
			}

			// check current bucket
			Integer current_bucket = bucket.get(index);
			if (current_bucket != null && Math.abs(Long.valueOf(nums[i]) - Long.valueOf(current_bucket)) < diff)
			{
				return true;
			}

			// if not return true yet, put the number into the bucket
			bucket.put(index, nums[i]);
			if (i >= k)
			{
				bucket.remove((Long.valueOf(nums[i - k]) - Long.valueOf(min)) / diff);
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		int[] test =
		{ -1, 2147483647 };
		Leetcode_220 contain = new Leetcode_220();
		boolean result = contain.containsNearbyAlmostDuplicate3(test, 1, 2147483647);
		System.out.println(result);
	}
}
