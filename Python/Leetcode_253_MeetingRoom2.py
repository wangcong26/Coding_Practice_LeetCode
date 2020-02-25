import heapq


class Solution(object):
    def minMeetingRooms(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        if not intervals:
            return 0

        # heap initialization
        free_rooms = []

        # sort
        intervals.sort(key=lambda x: x[0])

        heapq.heappush(free_rooms, intervals[0][1])

        for interval in intervals[1:]:
            # if the smallest in the priority queue is smaller than current starting time
            if free_rooms[0] <= interval[0]:
                heapq.heappop(free_rooms)
            heapq.heappush(free_rooms, interval[1])

        return len(free_rooms)


solution = Solution()

a = [[0, 30], [5, 10], [15, 20]]
result = solution.minMeetingRooms(a)
print(result)
