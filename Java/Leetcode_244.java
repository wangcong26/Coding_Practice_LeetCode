package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_244
{
	HashMap<String, ArrayList<Integer>> locations;

	// contructor
	public Leetcode_244(String[] words)
	{
		this.locations = new HashMap<String, ArrayList<Integer>>();

		// make a map
		for (int i = 0; i < words.length; i++)
		{
			ArrayList<Integer> loc = this.locations.getOrDefault(words[i], new ArrayList<Integer>());
			loc.add(i);
			this.locations.put(words[i], loc);
		}
	}

	public int shortest(String word1, String word2)
	{
		ArrayList<Integer> loc1, loc2;

		// location lists for both the words
		// the indices will be in Sorted order by default
		loc1 = this.locations.get(word1);
		loc2 = this.locations.get(word2);

		// l1 and l2 are two pointers.
		int l1 = 0, l2 = 0, minDiff = Integer.MAX_VALUE;
		while (l1 < loc1.size() && l2 < loc2.size())
		{
			minDiff = Math.min(minDiff, Math.abs(loc1.get(l1) - loc2.get(l2)));
			if (loc1.get(l1) < loc2.get(l2))
			{
				l1++;
			} else
			{
				l2++;
			}
		}
		return minDiff;
	}

	public static void main(String[] args)
	{
		String[] words= {"practice", "makes", "perfect", "coding", "makes"};
		Leetcode_244 obj = new Leetcode_244(words);
		int test = obj.shortest("makes", "makes");
		System.out.println(test);
	}

}
