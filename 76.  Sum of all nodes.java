import java.util.LinkedList;
import java.util.Queue;
public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;
	
			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/
		
		
		
		public static int sumOfAllNode(TreeNode<Integer> root){
			/* Your class should be named Solution
			* Don't write main().
			* Don't read input, it is passed as function argument.
			* Return output and don't print it.
			* Taking input and printing output is handled automatically.
			*/
			int ans = 0;
			Queue<TreeNode<Integer>> q = new LinkedList<>();
    		q.add(root);
			while (!q.isEmpty()) 
			{
				TreeNode<Integer> temp = q.poll();
				ans += temp.data;
				for (TreeNode<Integer> child : temp.children) 
				{
					q.add(child);
				}
			}
        	return ans;
		}
	}
