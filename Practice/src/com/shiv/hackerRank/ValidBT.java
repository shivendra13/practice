package com.shiv.hackerRank;

import java.util.ArrayDeque;

public class ValidBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int isValidBT(TreeNode a)
	{
		ArrayDeque<TreeNode> q= new ArrayDeque<TreeNode>();
		int l=0,c=0;
		if(a==null) return 1;
		
		q.add(a);
		q.add(null);
		while(!q.isEmpty())
		{
			a=q.poll();
			if(a==null)
			{
				if(!q.isEmpty())
				{
					q.add(null);
					l++;
					if(c<=Math.pow(2, l))
						continue;
					else return 0;
					
				}
			}
			else
			{
				if(l==0)c++;
				if(a.left != null)q.add(a.left);
				if(a.right != null)q.add(a.right);
			}
		}
		return 1;
	}
	

}
