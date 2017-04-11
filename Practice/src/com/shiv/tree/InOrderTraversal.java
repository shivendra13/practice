package com.shiv.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> inorderTraversal(TreeNode a)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		if(a==null)return list;
		while(true)
		{
			while(a!=null)
			{
				stack.push(a);
				a=a.left;
			}
			
			if(stack.isEmpty())
				break;
			a=stack.pop();
			list.add(a.val);
			a=a.right;
		}
				
		return list;
	}
	
	
	

}
