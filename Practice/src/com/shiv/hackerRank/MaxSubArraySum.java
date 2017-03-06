package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int query = input.nextInt();
		
		for(int i=0;i<query;i++)
		{
			int n=input.nextInt();
			int m=input.nextInt();
			int[] array=new int[n];
			for(int j=0;j<n;j++)
			{
				array[j]=input.nextInt();
			}
			System.out.println(maxSubArraySum(subsets(array),m));
			
		}
		
	}
	
	
	public static int maxSubArraySum(ArrayList<Integer> sum,int modulo)
	{
		int max_g=0,max=0;
		for(Integer value:sum)
		{
		max=value%modulo;
		if(max>max_g)
			max_g=max;
		}
		return max_g;
		
	}
	
	public static ArrayList<Integer> subsets(int[] S) {
		if (S == null)
			return null;
	 
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sum = new ArrayList<Integer>();
	 int skip=0;
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			skip=result.size()-i;
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				if(skip>0)
				{	skip--;
					continue;
				}
				else
				{
				temp.add(new ArrayList<Integer>(a));
				}
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
			
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
			
			for (ArrayList<Integer> a : temp) {
				int sum_l=0;
				for(Integer value : a)
				{
					sum_l=sum_l+value;
				}
				sum.add(sum_l);
			}
			
	 
			result.addAll(temp);
		}
	 
		//add empty set
	//	result.add(new ArrayList<Integer>());
	 
		return sum;
	}

}
