class Solution:
    def climbStairs(self, n: int, memo={}) -> int:
        if n in memo:
            return memo[n]
        #base case
        if n <= 1:
            return 1
        memo[n] =  self.climbStairs(n - 1, memo) + self.climbStairs(n-2, memo)
        return memo[n]
"""
Recursive approach failes due to time limit exception

USE memoization/caching data structure to store previously computed values,
avoiding redundant recomputation
"""
        