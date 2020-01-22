class Solution:
    def twoSum(self, nums, target):
        h = {}
        for i, num in enumerate(nums):
            n = target - num
            if n not in h:
                h[num] = i
            else:
                return [h[n], i]


solution = Solution()
result = solution.twoSum([2, 11, 4, 7, 9], 9)
print(result)
