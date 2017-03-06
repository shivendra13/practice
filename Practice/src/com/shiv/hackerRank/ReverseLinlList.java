package com.shiv.hackerRank;

public class ReverseLinlList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head= new LNode(1);
		head.next= new LNode(2);
		head.next.next=new LNode(3);
		head.next.next.next=new LNode(4);
		LNode reve=reverse(head);
		LNode.printNode(reve);

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

}
