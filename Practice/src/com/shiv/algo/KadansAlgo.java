package com.shiv.algo;

import java.util.ArrayList;
import java.util.List;

public class KadansAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a= new ArrayList<Integer>();
		a.add(-2);
		a.add(1);
		a.add(-3);
		a.add(4);
		a.add(-1);
		a.add(2);
		a.add(1);
		a.add(-5);
		a.add(4);
		System.out.println(sum(a));
	}

	
	public static int sum(List<Integer>a)
	{
		int max_local=a.get(0);
		int max_global=a.get(0);
		 int startIndex = 0, endIndex = 0;
		for(int i=1;i<a.size();i++)
		{
			
			if(max_local<=0)
			{
				max_local=a.get(i);
				 startIndex = i;
                 endIndex = i;
			}
			else
			{
				max_local=max_local+a.get(i);
			}
			if(max_global<max_local)
			{
				max_global=max_local;
                 endIndex = i;
			}
		}
		
		
		return max_global;
		
	}
}
