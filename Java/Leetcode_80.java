package leetcode;

public class Leetcode_80
{
	public int removeDuplicates(int[] nums)
	{
		int slowPointer = 0;
		int count = 0;
		for (int fastPointer = 1; fastPointer < nums.length; fastPointer++)
		{
			if (nums[fastPointer] != nums[slowPointer])
			{
				slowPointer++;
				nums[slowPointer] = nums[fastPointer];
				count = 0;
			} else if (nums[fastPointer] == nums[slowPointer])
			{
				if (count == 1)
				{
					continue;
				} else if (count == 0)
				{
					count++;
					slowPointer++;
					nums[slowPointer] = nums[fastPointer];
				}
			}
		}
		return slowPointer + 1;
	}

	public static void main(String[] args)
	{
		Leetcode_80 solution = new Leetcode_80();
		int[] testArray = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		int test = solution.removeDuplicates(testArray);
		System.out.println(test);
		for (int num : testArray)
		{
			System.out.print(num);
		}

	}

}
