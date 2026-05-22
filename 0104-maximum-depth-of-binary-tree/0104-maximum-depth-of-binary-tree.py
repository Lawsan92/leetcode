# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        # base/edge case: empty tree
        if root is None:
            return 0

        left_depth = self.maxDepth(root.left) 
        right_depth = self.maxDepth(root.right)

        return 1 + max(left_depth, right_depth)
        

"""
Algo: DFS

# use recursive programming to break the problem down into sub problems
    # return the depth of a node
e.g.

   20
  /  \
15    7

The depth of nodes 15 and 7 should be 1



# Drill down the tree until we hit the bottom of the tree (i.e., a leaf node)
# once we hit the bottom:
  # return 0 for an empty child, because an empty tree has a depth of 0
  # increment the base value by 1, indicating that we're climbing up 1 level at a time
# when we hit a branch with children
  # return the value of the branch with the deeper level

root: TreeNode {
    val: 3,
    left: TreeNode {
        val: 9, 
        left: None, right: None
    }, 
    right: TreeNode { 
        val: 20, 
        left: TreeNode {
            val: 15, 
            left: None, right: None
        }, 
        right: TreeNode {
            val: 7, 
            left: None, right: None
        }
    }
}

"""