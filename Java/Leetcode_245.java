package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

// 245. Shortest Word Distance III

public class Leetcode_245
{
	public int shortestWordDistance(String[] words, String word1, String word2)
	{
		HashMap<String, ArrayList<Integer>> location = new HashMap<String, ArrayList<Integer>>();

		// create a map
		for (int i = 0; i < words.length; i++)
		{
			ArrayList<Integer> loc = location.getOrDefault(words[i], new ArrayList<Integer>());
			loc.add(i);
			location.put(words[i], loc);
		}

		ArrayList<Integer> loc1 = location.get(word1);
		ArrayList<Integer> loc2 = location.get(word2);

		int l1 = 0;
		int l2 = 0;
		int minDistance = Integer.MAX_VALUE;
		if (word1.equals(word2))
		{
			if (location.get(word1).size() > 1)
			{
				if (location.get(word1).size() == 2)
				{
					return Math.abs(location.get(word1).get(1) - location.get(word1).get(0));
				} else
				{
					for (int i = 1; i < location.get(word1).size(); i++)
					{
						minDistance = Math.min(minDistance,
								Math.abs(location.get(word1).get(i) - location.get(word2).get(i - 1)));
					}
					return minDistance;
				}
			} else
			{
				return 0;
			}
		} else
		{
			while (l1 < loc1.size() && l2 < loc2.size())
			{
				minDistance = Math.min(minDistance, Math.abs(loc1.get(l1) - loc2.get(l2)));
				if (loc1.get(l1) < loc2.get(l2))
				{
					l1++;
				} else
				{
					l2++;
				}
			}
		}

		return minDistance;
	}

	// Shorter version
	public int shortestWordDistance2(String[] words, String word1, String word2)
	{
		long dist = Integer.MAX_VALUE, i1 = dist, i2 = -dist;
		
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].equals(word1))
				i1 = i;
			if (words[i].equals(word2))
			{
				if (word1.equals(word2))
					i1 = i2;
				i2 = i;
			}
			dist = Math.min(dist, Math.abs(i1 - i2));
		}
		return (int) dist;
	}
}
