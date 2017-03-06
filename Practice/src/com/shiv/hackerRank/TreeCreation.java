package com.shiv.hackerRank;

import java.util.ArrayList;

public class TreeCreation {
	static int preIndex = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> preorder= new ArrayList<>();
		preorder.add(1);
		preorder.add(2);
		preorder.add(3);
		preorder.add(4);
		preorder.add(5);
		ArrayList<Integer> inorder= new ArrayList<>();
		inorder.add(3);
		inorder.add(2);
		inorder.add(4);
		inorder.add(1);
		inorder.add(5);
		buildTree(preorder, inorder);
		

	}
	public static TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder)
	{
		
		int len=0;
		if(preorder.size()==inorder.size())
			len=preorder.size();
		TreeNode tNode=build(0, len-1, preorder, inorder);
		return tNode;
		
	}
	
	public static TreeNode build(int start,int end,ArrayList<Integer> preorder, ArrayList<Integer> inorder)
	{
		
		if(start>end)
		{
			return null;
		}
		System.out.println(preIndex);
		TreeNode tNode= new TreeNode(preorder.get(preIndex++));
		
		 if(start==end)
			 return tNode;
		 
		 int index=search(inorder, start, end, tNode);
		 tNode.left=build(start, index-1, preorder, inorder);
		 tNode.right=build(index+1, end, preorder, inorder);
		 
		 return tNode;
	}
	public static int search(ArrayList<Integer> inorder,int start,int end,TreeNode tNode)
	{
		int i=0;
		for( i=start;i<=end;i++)
		{
			if(inorder.get(i)==tNode.val)
			{
				return i;
			}
		}
		return i;
	}

}
