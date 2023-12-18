import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.HashMap;
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
    private static void helper(TreeNode < Integer > root, int k, int prefix, Integer[] totalCount,
        HashMap < Integer, Integer > count) {
        // Return, If root is null.
        if (root == null) {
            return;
        }

        // Add root's data in prefix
        prefix += root.data;

        // Increment totalCount, If found new path with sum of nodes equal to k.
        if (count.get(prefix - k) != null) {
            totalCount[0] += count.get(prefix - k);
        }

        // Increment corresponding value of count that is having key as prefix.
        if (count.get(prefix) != null) {
            count.put(prefix, count.get(prefix) + 1);
        } else {
            count.put(prefix, 1);
        }

        // Check for left and right child.
        helper(root.left, k, prefix, totalCount, count);
        helper(root.right, k, prefix, totalCount, count);

        /*
            Decrement value of count[prefix] to avoid 
            paths having left and right both children included.
        */
        count.put(prefix, count.get(prefix) - 1);

        return;
    }

    public static int noWays(TreeNode < Integer > root, int k) {
        // Make un HashMap map to store prefix sums.
        HashMap < Integer, Integer > count = new HashMap < > ();
        count.put(0, 1);

        Integer[] totalCount = new Integer[1];
        totalCount[0] = 0;

        helper(root, k, 0, totalCount, count);

        return totalCount[0];
    }
}
