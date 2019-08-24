# -*- coding: utf-8 -*-
"""
Created on Sat Aug 24 10:17:08 2019
Leetcode 118
"""

class Solution:
    def generate(self, num_rows):
        triangle=[]
        
        for num in range(num_rows):
            row=[None for _ in range(num+1)]
            row[0]=1
            row[-1]=1
            for i in range(1,len(row)-1):
                row[j]=triangle[num-1][j]+triangle[num-1][j-1]
        
        triangle.append(row)
                
            