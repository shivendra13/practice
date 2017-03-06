package com.shiv.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in); 
		int M=input.nextInt();
		int N=input.nextInt();
		int[] arry= new int[N];
		
	for(int i=0;i<N;i++)
		{
			arry[i]=input.nextInt();
		}
		
		System.out.println(sum(M,N,arry));

	}

	private static int sum(int m, int n,int[] arry) {
		// TODO Auto-generated method stub
		int paircount=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i =0; i<n;i++)
		{
			Integer freq=(Integer) map.get(arry[i]);
			int f=0;
			if(null!=freq)
			{
				f=freq.intValue();
			map.put(arry[i], f++);
			}
			else
			{
				f++;
				map.put(arry[i], f);
			}
		
		}
		
		for(int j=0;j<n;j++)
		{
			int diff=n-arry[j];
			Integer value= (Integer) map.get(diff);
			if(null!=value&&value.intValue()>0)
			{
				paircount=1;
			}
		}
		
		return paircount;
		
	}

	
	
	
}
