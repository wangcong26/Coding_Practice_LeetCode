class Solution(object):
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """

        def isPali(self, s, left, right):
            while left < right:
                if s[left] != s[right]:
                    return False
            return True

        left = 0
        right = len(s) - 1
        s_new = list(s)
        while left < right:
            if s_new[left] != s_new[right]:
                return isPali(s_new, left, right - 1) | isPali(s_new, left + 1, right)





for k in range(2,6):
    print(k)