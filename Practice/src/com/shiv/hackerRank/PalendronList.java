package com.shiv.hackerRank;

public class PalendronList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head= new LNode(1);
//		head.next= new LNode(2);
//		head.next.next=new LNode(2);
//		head.next.next.next=new LNode(1);
		//head.next.next.next.next=new LNode(1);
		System.out.println(isPalendron(head));

	}

	public static boolean isPalendron(LNode head)
	{
		LNode fast=head;
		LNode slow=head;
		LNode slow_prev=null;
		LNode mid=null;
		
		if(head.next==null)
			return true;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow_prev=slow;
			slow=slow.next;
			
		}
		if(fast!=null)
		{
			slow_prev.next=null;
			mid=slow.next;
			
		}
		else
		{
			slow_prev.next=null;
			mid=slow;
		}
		
		LNode secondList=LNode.reverse(mid);
		while(head!=null && secondList!=null)
		{
			if(head.data!=secondList.data)
				return false;
			
			head=head.next;
			secondList=secondList.next;
		}
		return true;
	}
}
