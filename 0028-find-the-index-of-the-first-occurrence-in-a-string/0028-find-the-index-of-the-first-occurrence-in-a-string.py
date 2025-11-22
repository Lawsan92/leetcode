class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(haystack) <= 0 or len(needle) <= 0:
            return -1
        
        for i, char in enumerate(haystack):
            if len(needle) == 1:
                if char == needle:
                    return i
            else:
                if i + len(needle) > len(haystack):
                    return -1
                if haystack[i: i + len(needle)] == needle:
                    return i
        return -1


        