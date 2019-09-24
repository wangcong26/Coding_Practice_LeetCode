package leetcode;

public class Leetcode_189
{
	// Given an array, rotate the array to the right by k steps, where k is non-negative.
	// Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4]
	public void rotate1(int[] nums, int k)
	{
		int[] copy = nums.clone();
		for (int i = 0; i < nums.length; i++)
		{
			if (i + k < nums.length)
			{
				nums[i + k] = copy[i];
			} else
			{
				nums[(k + i) % nums.length] = copy[i];
			}
		}
	}

	// Time complexity O(n), Space O(n)
	public void rotate2(int[] nums, int k)
	{
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			a[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = a[i];
		}
	}

	public static void main(String[] args)
	{
		Leetcode_189 solution = new Leetcode_189();
		int[] testArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		solution.rotate1(testArray, 3);

		for (int num : testArray)
		{
			System.out.print(num);
		}

	}

}
