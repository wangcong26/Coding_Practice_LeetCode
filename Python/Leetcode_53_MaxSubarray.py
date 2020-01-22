class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        max_sum = nums[0]

        for i in range(1, n):
            if nums[i - 1] > 0:
                nums[i] += nums[i - 1]
            max_sum = max(nums[i], max_sum)

        return max_sum

    def maxSubArray2(self, nums):

        n = len(nums)
        curr_sum = max_sum = nums[0]
        for i in range(1, n):
            curr_sum = max(nums[i], curr_sum)
            max_sum = max(curr_sum, max_sum)
        return max_sum
