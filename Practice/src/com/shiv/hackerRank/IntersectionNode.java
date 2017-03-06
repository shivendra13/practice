package com.shiv.hackerRank;

public class IntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public LNode getIntersectionNode(LNode a, LNode b) {
		
		int m=LNode.length(a);
		int n=LNode.length(b);
		int diff=n-m;
		if(m>n)
		{
			LNode temp=a;
			a=b;
			b=temp;
			diff=m-n;
		}
		for(int i=0;i<diff;i++)
		{
			b=b.next;
		}
		
		while(a!=null && b!=null)
		{
			if(a==b)
				return a;
			
			a=a.next;
			b=b.next;
		}
		return null;
	}

}
