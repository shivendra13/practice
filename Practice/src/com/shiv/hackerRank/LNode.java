package com.shiv.hackerRank;

public class LNode {
	int data;
	LNode next;
	
	LNode(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	public static LNode insertNode(LNode head,LNode newNode,int postion)
	{
		if(head==null)return newNode;
		if(postion==1)
		{
			newNode.next=head;
			return newNode;
		}
		else
		{
			LNode prev=head;
			LNode curr=head;
			int count=1;
			while(curr.next!=null)
			{
				prev=curr;
				count++;
				curr=curr.next;
				if(count==postion)
				{
					prev.next=newNode;
					newNode.next=curr;
				}
				
			}
		}
		
			
		return head;
		
	}
	
	public static LNode deleteNode(LNode head,int postion)
	{
		if(head==null) return null;
		if(postion==1)
		{
			LNode deletNode=head;
			head=head.next;
			deletNode.next=null;
			return head;
		}
		else
		{
			LNode prev=head,curr=head;
			int count=1;
			while(curr.next!=null)
			{
				prev=curr;
				count++;
				curr=curr.next;
				if(count==postion)
				{
					LNode deletNode=curr;
					prev.next=curr.next;
					deletNode.next=null;
				}
			}
		}
		return head;
	}
	
	public static void printNode(LNode head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static int getMiddle(LNode head)
	{
		if(head==null) return 0;
		LNode fast=head;
		LNode slow=head;
		int count=0;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			count++;
		}
		//If list is even the fast pointer will be at null else it will be on last node.
		if(fast!=null) count++;
	return count;
		
	}
	
	public static LNode reverse(LNode head)
	{
		LNode prev=null;
		LNode curr=head;
		LNode next=head;
		while(next!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
		
	}
	
	public static int length(LNode head)
	{
	int count=0;
	while(head!=null)
	{
		count++;
		head=head.next;
	}
	return count;
	}
	public static void main(String[] args)
	{
		LNode head= new LNode(1);
		head.next= new LNode(2);
		head.next.next=new LNode(3);
		head.next.next.next=new LNode(4);
	//	head.next.next.next.next=new LNode(5);
		
		
	//	insertNode(head, newNode, 3);
	//	printNode(head);
	//	deleteNode(head, 3);
	//	printNode(head);
		System.out.println(getMiddle(head));
	}

}
