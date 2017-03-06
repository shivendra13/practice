package com.shiv.hackerRank;

import java.util.Arrays;

public class KLargerstSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1, 2, 10, 20, 40, 32, 44, 51, 6 };
		a=sort(a);
		getksmallest(a, 4);
		getKLargest(a, 1);

	}

	
	public static int[] sort(int[] a)
	{
		Arrays.sort(a);
		return a;
	}
	
	public static void getksmallest(int[] a,int k)
	{int index =k;
		for(int i=0;i<a.length;i++)
		{
			
			k--;
			if(k==0)
				System.out.println(index+"th Smallest number in a is -->"+a[i]);
			else
				continue;
		}
		
	}
	
	public static void getKLargest(int[] a ,int k)
	{int index =k;
		for(int i=a.length-1;i>0;i--)
		{
			k--;
			if(k==0)
				System.out.println(index+"th largest number in a is -->"+a[i]);
			else
				continue;
		}
	}
}

