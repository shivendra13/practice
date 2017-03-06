package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Stack;

public class SearchInTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(3);
		a.left=new TreeNode(5);
		a.right=new TreeNode(10);
		a.left.left=new TreeNode(13);
		a.left.right=new TreeNode(15);
		a.right.right=new TreeNode(20);
		a.right.right.right=new TreeNode(30);
		
		TreeNode b=new TreeNode(30);
		System.out.println(findData(a, b));
		
		ArrayList<Integer> list=searchNode(a, b);
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}
	
	public static ArrayList<Integer> searchNode(TreeNode a,TreeNode b) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode current=a;
		if(a==null)return list;
		while(current!=null || !stack.isEmpty())
		{
			if(current!=null)
			{
				stack.push(current);
				if(current.val==b.val)
					break;
				current=current.left;
			}
			else{
			TreeNode temp=stack.peek().right;
			 if(temp==null){
				temp = (TreeNode)stack.pop();
				while(!stack.isEmpty() && temp==stack.peek().right)
				{
				 temp = (TreeNode)stack.pop();
				}
			}
			else
	    		{
	    		    current=temp;
	    		}
			
			
		}
		}
		for(TreeNode x:stack)
		{
			list.add(x.val);
		}
		return list;
		}
	
	public static boolean findData(TreeNode a,TreeNode b)
	{
		
		if(a==null || b==null)
			return false;
		if(a.val==b.val) return true;
		else if(findData(a.left, b) || findData(a.right, b))
			return true;
		
		return false;
	}

}
