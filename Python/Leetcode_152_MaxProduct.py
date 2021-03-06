# time: O(n)
class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        current_max = nums[0]
        current_min = nums[0]
        final_max = nums[0]

        for i in range(1, len(nums)):
            temp = current_max
            current_max = max(max(current_max * nums[i], current_min * nums[i]), nums[i])
            current_min = min(min(temp * nums[i], current_min * nums[i]), nums[i])

            if current_max > final_max:
                final_max = current_max
        return final_max
