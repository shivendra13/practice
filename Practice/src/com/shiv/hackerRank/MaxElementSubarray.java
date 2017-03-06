package com.shiv.hackerRank;
//Count of subarrays whose maximum element is greater than k
public class MaxElementSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		maxSubarruCount(a);

	}

	
	public static int maxSubarruCount(int a[])
	{
		for (int i =0; i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k =i;k<=j;k++)
				{
				System.out.print(a[k]+" ,");
				}
				System.out.println();
			}
			
		}
		
		
		return 0;
		
	}
	
	public static void subArray(int a[])
	{
		int[][] temp= new int[a.length][];
		
	}
}
