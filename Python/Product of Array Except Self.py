"""
Created on Wed Jul 24 13:32:08 2019

@author: swang
"""

def product(nums):
    # length of the input array
    length=len(nums)

    # initialize three arrays
    left=[0]*length
    right=[0]*length
    result=[0]*length

    # first element of left is 1
    # last element of right is 1
    left[0]=1
    right[length-1]=1

    # L[i - 1] already contains the product of elements to the left of 'i - 1'
    # Simply multiplying it with nums[i - 1] would give the product of all
    # elements to the left of index 'i'
    for i in range(1, length):
        left[i]=left[i-1]*nums[i-1]

    # R[i] contains the product of all the elements to the right
    # Note: for the element at index 'length - 1', there are no elements to the right,
    # so the R[length - 1] would be 1
    for i in range(length-2,-1,-1):
        right[i]=right[i+1]*nums[i+1]

    # For the first element, R[i] would be product except self
    # For the last element of the array, product except self would be L[i]
    # Else, multiple product of all elements to the left and to the right
    for i in range(length):
        result[i]=left[i]*right[i]

    return result


'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        # The length of the input array
        length = len(nums)

        # The answer array to be returned
        answer = [0]*length

        # answer[i] contains the product of all the elements to the left
        # Note: for the element at index '0', there are no elements to the left,
        # so the answer[0] would be 1
        answer[0] = 1
        for i in range(1, length):

            # answer[i - 1] already contains the product of elements to the left of 'i - 1'
            # Simply multiplying it with nums[i - 1] would give the product of all
            # elements to the left of index 'i'
            answer[i] = nums[i - 1] * answer[i - 1]

        # R contains the product of all the elements to the right
        # Note: for the element at index 'length - 1', there are no elements to the right,
        # so the R would be 1
        R = 1;
        for i in reversed(range(length)):

            # For the index 'i', R would contain the
            # product of all elements to the right. We update R accordingly
            answer[i] = answer[i] * R
            R *= nums[i]

        return answer
'''
