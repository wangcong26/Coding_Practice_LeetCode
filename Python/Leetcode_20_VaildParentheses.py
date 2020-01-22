class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        mapping = {")": "(", "}": "{", "]": "["}

        for char in s:
            if char in mapping:
                top_element = stack.pop() if stack else '#'
                if mapping[char] != top_element:
                    return False
            else:
                stack.append(char)

        return not stack

    def isValid2(self, s):
        bracket_map = {"(": ")", "[": "]", "{": "}"}
        open_par = set(["(", "[", "{"])
        stack = []
        for i in s:
            if i in open_par:
                stack.append(i)
            elif stack and i==bracket_map[stack[-1]]:
                stack.pop()
            else:
                return False # other character types
        return stack==[]