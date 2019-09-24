package leetcode;

public class Leetcode_299
{
	public String getHint(String secret, String guess)
	{
		int bull = 0;
		int cow = 0;
		int length = secret.length();
		int[] numbers = new int[10];
		for (int i = 0; i < length; i++)
		{
			if (secret.charAt(i) == guess.charAt(i))
			{
				bull++;
			} else
			{
				numbers[secret.charAt(i) - '0']++;
			}
		}

		for (int i = 0; i < length; i++)
		{
			if (guess.charAt(i) != secret.charAt(i) && numbers[guess.charAt(i) - '0'] > 0)
			{
				numbers[guess.charAt(i) - '0']--;
				cow++;
			}
		}
		String finalOutput = bull + "A" + cow + "B";
		return finalOutput;

	}

	public static void main(String[] args)
	{
		Leetcode_299 hint = new Leetcode_299();
		String secret = "1807";
		String guess = "7810";

		System.out.println(hint.getHint(secret, guess));

	}

}
