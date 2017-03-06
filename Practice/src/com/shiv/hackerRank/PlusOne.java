package com.shiv.hackerRank;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		//0, 0, 4, 4, 6, 0, 9, 6, 5, 1 
		a.add(0);
		a.add(0);
		a.add(4);
		a.add(4);
		a.add(6);
		a.add(0);
		a.add(9);
		a.add(6);
		a.add(5);
		a.add(1);
	//	a.add(9);
		reverseList(a);
		ArrayList<Integer> b=reverseList(plusOne(a));
		printList(removeLeadingZero(b));
	}

	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a)
	{
		int dig=a.get(0)+1;
		int carry=0;
		if(dig>9)// for cases which have 9 in the end like 9999
		{
			carry=1;
			a.set(0, 0);
		for(int i=1;i<a.size();i++)
		{
			if(a.get(i)==9 && carry==1)
			{
				a.set(i, 0);
				carry=1;
			}
			else if(carry==1)
			{
				carry=0;
				a.set(i, a.get(i)+1);
			}
			
			
		}
		if(carry==1)// if still we have a carryover left we have to increase the array lenght by 1
		{
			ArrayList<Integer> b=new ArrayList<Integer>();
			for(int i=0;i<=a.size();i++)b.add(0);
			for(int i=0;i<a.size();i++)
			{
				b.set(i, a.get(i));
			}
			b.set(b.size()-1, 1);
			return b;
		}
		}
		else
		{// for normal cases
			a.set(0, dig);
		}
		
	
		return a;
		
	}
	
	public static ArrayList<Integer> reverseList(ArrayList<Integer> a)
	{
		int end=a.size()-1;
		int start=0;
		int mid=end/2;
		for(int i=start;i<=mid;i++)
		{
			int temp=a.get(i);
			a.set(i, a.get(end));
			a.set(end, temp);
			end--;
		}
		return a;
		
	}
	public static void printList(ArrayList<Integer> a)
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}
	public static ArrayList<Integer> removeLeadingZero(ArrayList<Integer> a)
	{int count =0;
		for(int i=0;i<a.size();i++)
		{ 
			if(a.get(i)>0)
				break;
			count++;
		}
		ArrayList<Integer> b= new ArrayList<Integer>();
		int bsize=a.size()-count;
		for(int i=0;i<bsize;i++)b.add(0);
		for(int i=0;i<bsize;i++)
		{
			b.set(i, a.get(count+i));
		}
		
		return b;
	}
}
