package leetcode;

/*
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
Return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.

Note:
If there exists a solution, it is guaranteed to be unique.
Both input arrays are non-empty and have the same length.
Each element in the input arrays is a non-negative integer.
 */
public class Leetcode_134
{
	public int canCompleteCircuit(int[] gas, int[] cost)
	{
		int n = gas.length;
		int total_tank = 0;
		int curr_tank = 0;
		int starting_station = 0;
		for (int i = 0; i < n; i++)
		{
			total_tank += gas[i] - cost[i];
			curr_tank += gas[i] - cost[i];

			if (curr_tank < 0)
			{
				starting_station = i + 1;
				curr_tank = 0;
			}
		}
		return total_tank >= 0 ? starting_station : -1;
	}

	public static void main(String[] args)
	{
		Leetcode_134 car = new Leetcode_134();
		int[] gas = new int[] { 1, 2, 3, 4, 5 };
		int[] cost = new int[] { 3, 4, 5, 1, 2 };

		System.out.println(car.canCompleteCircuit(gas, cost));
	}

}
