# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        # base case: at leaf
        if root == None:
            return root
        print('CALL')
        print('root:', root)
        self.invertTree(root.left) # left: TreeNode{val: 1, left: None, right: None}
        self.invertTree(root.right) # right: TreeNode{val: 3, left: None, right: None}
        temp = root.left
        root.left = root.right
        root.right = temp
        print('root:', root)

        return root
        
        
"""
# 'invert' = swap branches symmetrically 

# I/O: [4,2,7,1,3,6,9]

i.e.

    4
 \7      \2
\3 \1   \6 \9

i.e

root: {
    val: 4,
    left: {
        val:2,
        left: {
            val:1,
            left: none,
            right: none,
        },
        right: {
            val: 3,
            left: none,
            right: none
        }
    }
}


root: TreeNode{val: 4, left: TreeNode{val: 2, left: TreeNode{val: 1, left: None, right: None}, right: TreeNode{val: 3, left: None, right: None}}, right: TreeNode{val: 7, left: TreeNode{val: 6, left: None, right: None}, right: TreeNode{val: 9, left: None, right: None}}}

# travese over tree


"""