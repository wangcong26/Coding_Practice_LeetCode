class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s_new = ''.join(x for x in s if x.isalnum()).lower()

        if s_new == s_new[::-1]:
            return True
        else:
            return False

    def isPalindrome2(self, s):
        s = list(s.lower())
        new = []
        for each in s:
            if each.isalnum():
                new.append(each)
        length = len(new)
        left = 0
        right = length - 1
        while left < right:
            if new[left] == new[right]:
                left = left + 1
                right = right - 1
            else:
                return False
        return True
solution=Solution()
print(solution.isPalindrome2("A man, a plan, a canal: Panama"))