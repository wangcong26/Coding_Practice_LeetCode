class Solution(object):
    def insert(self, intervals, newInterval):
        """
        :type intervals: List[List[int]]
        :type newInterval: List[int]
        :rtype: List[List[int]]
        """
        merged=[]

        intervals.append(newInterval)

        intervals.sort(key=lambda x : x[0])

        for interval in intervals:
            if not merged or merged[-1][1] < interval[0]:
                merged.append(interval)
            else:
                merged[-1][1] = max(merged[-1][1], interval[1])
        return merged

solution = Solution()
intervals = [[1,3],[6,9]]
newInterval = [2,5]
new=solution.insert(intervals,newInterval)
print(new)