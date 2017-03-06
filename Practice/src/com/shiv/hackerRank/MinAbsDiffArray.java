package com.shiv.hackerRank;

import java.util.Arrays;

public class MinAbsDiffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getMinAbsArray(int[] a)
	{
		int min=Integer.MAX_VALUE;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{ 
			int min_l=Math.abs(a[i]-a[i+1]);
			if(min_l<min)
			{
				min=min_l;
			}
		}
		return min;
	}

}
