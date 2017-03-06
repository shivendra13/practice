package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class StrictlyIncreSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
	//	a.add(22);
		int mid=a.size()/2;
		int count=0;
		count=strictlyIncreSequence(a,0,a.size(),count);
		
//		Scanner input = new Scanner(System.in);
//		int length=input.nextInt();
//		for(int i=0;i<length;i++)
//		{
//			a.add(input.nextInt());
//		}
//		
//		System.out.println(strictlyIncreSequence(a));
		

	}
	
	
	public static int strictlyIncreSequence(ArrayList<Integer> a,int start,int end,int count)
	{
		if(a==null) return 0;
		if(start<end){
		int mid = (start+end)/2;
		count=strictlyIncreSequence(a,0,mid,count);
		count=strictlyIncreSequence(a, mid+1, end, count);
		count=sequenceUtil(a, start,end, count);
		}
		
		return count;
	}
	
	
	public static int sequenceUtil(ArrayList<Integer> a,int start,int end,int count)
	{
		for(int i=start;i<end;i++)
		{
			if(a.get(i)>=a.get(i+1))
			{
				int value=a.get(i);
				value++;
				a.set(i+1, value);
				
				count++;
			}
		}
		
		
		
		
		return count;
	}
	

}
