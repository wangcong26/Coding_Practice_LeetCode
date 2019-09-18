package leetcode;

// Jump game
public class Leetcode_55
{
	public boolean canJump(int[] nums)
	{
		if (nums.length < 2)
		{
			return true;
		}
		int reach = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length && i <= reach; i++)
		{
			reach = Math.max(reach, nums[i] + i);
			if (reach >= nums.length - 1)
			{
				return true;
			}
		}
		return false;
	}
}
