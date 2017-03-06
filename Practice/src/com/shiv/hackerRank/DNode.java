package com.shiv.hackerRank;

public class DNode 	{
	     int data;
	     DNode next;
	  

public static int getListLenght(DNode head)
{
	int count=0;
	while(head!=null)
	{
		count++;
		head=head.next;
	}
	return count;
}

public static void printList(DNode head)
{
	while(head!=null)
	{
		System.out.println(head.data);
		head=head.next;
	}
}
}