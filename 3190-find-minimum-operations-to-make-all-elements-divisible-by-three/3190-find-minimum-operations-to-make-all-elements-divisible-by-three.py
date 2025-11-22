class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        count = 0
        if len(nums) <= 0:
            return 0

        for num in nums:
            if (num % 3 != 0):
                count = count + 1
        return count
        