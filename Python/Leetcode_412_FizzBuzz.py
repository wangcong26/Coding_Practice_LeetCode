class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        for num in range(1, n + 1):
            if num % 3 == 0 and num % 5 == 0:
                result.append('FizzBuzz')
            elif num % 3 == 0 and num % 5 != 0:
                result.append('Fizz')
            elif num % 5 == 0 and num % 3 != 0:
                result.append('Buzz')
            else:
                result.append(str(num))
        return result

    def fizzBuzz2(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        for num in range(1, n + 1):
            divisible_by_3 = (num % 3 == 0)
            divisible_by_5 = (num % 5 == 0)

            num_ans_str = ""
            if divisible_by_3:
                num_ans_str = num_ans_str + "Fizz"
            if divisible_by_5:
                num_ans_str = num_ans_str + "Buzz"
            if not num_ans_str:
                num_ans_str = str(num)

            result.append(num_ans_str)

        return result


solution = Solution()
test = solution.fizzBuzz(15)
print(test)
