# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        self.memo = {}

        return self.helper(head)

    def helper(self, head):
        if head is None:
            return False

        if head in self.memo:
            return True

        self.memo[head] = True
        return self.helper(head.next)


"""
EDGE CASE:
# less than 2 nodes -> return False

# Memoize head: {}

head -> 3 -> 2 -> 0 -> 4 
             ^
              \______/
=> {
    "head -> 3 -> 2 -> 0 -> 4 -> ...2": True
    }

head -> 2 -> 0 -> 4 
        ^
        \_______/
=> {
    "head -> 3 -> 2 -> 0 -> 4 -> ...2": True, 
    "head -> 2 -> 0 -> 4 -> ...2": True
    }

head -> 0 -> 4 -> ...2
        
=> {
    "head -> 3 -> 2 -> 0 -> 4 -> ...2": True, 
    "head -> 2 -> 0 -> 4 -> ...2": True,
    "head -> 0 -> 4 -> ...2": True
    }

head -> 4 -> ...2
        
=> {
    "head -> 3 -> 2 -> 0 -> 4 -> ...2": True, 
    "head -> 2 -> 0 -> 4 -> ...2": True,
    "head -> 0 -> 4 -> ...2": True, 
    "head -> 4 -> ...2": True
    }


"""
        