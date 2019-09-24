package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_217
{
	public boolean containsDuplicate(int[] nums)
	{
		Set<Integer> set = new HashSet<>(nums.length);
		for (int x : nums)
		{
			if (set.contains(x))
				return true;
			set.add(x);
		}
		return false;
	}

	// sort first and the adjacent ones indicate duplicate
	// This is faster
	/*
	 * Time complexity : O(nlogn). 
	 * Sorting is O(nlogn) and the sweeping is O(n). 
	 * The entire algorithm is dominated by the sorting step, which is O(nlogn).
	 * Space complexity : O(1)O(1). Space depends on the sorting implementation which, usually, 
	 * costs O(1) auxiliary space if heap sort is used.
	 * */
	public boolean containsDuplicate2(int[] nums)
	{
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; ++i)
		{
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}
}
