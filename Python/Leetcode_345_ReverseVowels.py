class Solution(object):
    def reverseVowels(self, s):

        """
        :type s: str
        :rtype: str
        """

        vowels = "aeiouAEIOU"

        i = 0
        j = len(s) - 1
        l = list(s)
        while i < j:
            if l[i] in vowels:
                if l[j] in vowels:
                    l[i], l[j] = l[j], l[i]
                    i += 1
                    j -= 1
                else:
                    j -= 1
            else:
                i += 1
        return "".join(l)


solution = Solution()
print(solution.reverseVowels("hello"))

s='abHdkHHD'
a=s.lower()
print(a)