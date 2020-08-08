import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
	class Solution {
	   
	    List<node> points=null;
		public List<List<Integer>> verticalTraversal(TreeNode root) {
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        if(root == null)
	        	return new ArrayList<List<Integer>>();
	        points = new ArrayList<node>();
	        traverse(root,0,0);
             Collections.sort(points, (p1, p2) -> p1.x == p2.x ? p1.y == p2.y ? p1.val - p2.val : p2.y - p1.y : p1.x - p2.x);
			
            //for(node p:points)
                //System.out.println(p.val);
	        int previous=points.get(0).x;
	        ArrayList<Integer> result = new ArrayList<Integer>();
            int count=1;
	        for(node p:points)
	        {
	        	int x1=p.x;
	        	if(x1==previous)
	        	{
	        		result.add(p.val);
                     if(count==points.size())
                        ans.add(result) ;   
                     
	        	}
	        	else
	        	{
	        		ans.add(result);
	        		result= new ArrayList<Integer>();
                    result.add(p.val);
	        		previous=p.x;
                    if(count==points.size())
                        ans.add(result) ;                  
	        	}
                count++;
	        }
	      
	        
	        
	        return ans;
	    }
		private void traverse(TreeNode root, int i, int j) {
			if(root != null)
			{
				points.add(new  node(i,j,root.val));
				traverse(root.left, i-1, j-1);
				traverse(root.right, i+1, j-1);
				
			}
			
		}
	}
class node{
	    	int x,y,val;
	    	node(int x,int y ,int val)
	    	{
	    		this.x=x;
	    		this.y=y;
	    		this.val=val;
	    	}
}
