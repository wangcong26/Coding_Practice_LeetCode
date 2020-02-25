class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        import math
        if c < 0:
            return False

        left = 0
        right = int(math.sqrt(c))

        while (left <= right):
            my_sum = left ** 2 + right ** 2
            if my_sum == c:
                return True
            elif my_sum < c:
                left = left + 1
            elif my_sum > c:
                right = right - 1

        return False
