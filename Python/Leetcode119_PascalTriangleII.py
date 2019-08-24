# -*- coding: utf-8 -*-
"""
Created on Sat Aug 24 11:25:37 2019

Leetcode 119

Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.
"""

class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        
        triangle=[]
        
        for num in range(rowIndex+1):
            row=[None for _ in range(num+1)]
            row[0]=1
            row[-1]=1
            for i in range(1,len(row)-1):
                row[i]=triangle[num-1][i]+triangle[num-1][i-1]
            triangle.append(row)
        
        return triangle[rowIndex]
            