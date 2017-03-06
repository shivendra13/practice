package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Stack;

public class AllPathOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(3);
		a.left=new TreeNode(5);
		a.right=new TreeNode(10);
		a.left.left=new TreeNode(13);
		a.left.right=new TreeNode(15);
		a.right.left=new TreeNode(20);
		a.right.right=new TreeNode(30);
		a.right.right.right=new TreeNode(50);
		getAllTreePath(a);
	}
	
	public static ArrayList<ArrayList<Integer>> getAllTreePath(TreeNode root)
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1= new ArrayList<Integer>();
		Stack<TreeNode> s= new Stack<TreeNode>();
		TreeNode current =root;
		while(current!=null || !s.isEmpty())
		{
			if(current!=null)
			{
			s.push(current);
			list1.add(current.val);
			current=current.left;
			}
			else
			{
		TreeNode temp=s.peek().right;
		if(temp==null)
		{
			temp=s.pop();
			printList(list1);
			list.add(list1);
			list1.remove(list1.size()-1);
		while(!s.isEmpty() && temp==s.peek().right)
		{
			temp=s.pop();
			list1.remove(list1.size()-1);
		}
		}
		else
			current=temp;
		
		}
		}
		return list;
	}
	public static void printList(ArrayList<Integer> list1)
	{
		for(Integer i:list1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	

}
