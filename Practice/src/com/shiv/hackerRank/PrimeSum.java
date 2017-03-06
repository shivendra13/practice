package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrimeSum {
	public static void main(String[] args)
	{
		ArrayList<Integer> a= getSum(16777214);
		
		
		for(int i=0;i<a.size();i++)
		{
				System.out.println(a.get(i));
			
		}
	}
	
	public static ArrayList<Integer> getPrimeList(int n)
	{
		ArrayList<Integer> prime=new ArrayList<Integer>();
		for(int i =0;i<n;i++)
		{
			prime.add(1);
		}
		prime.set(0, 0);
		prime.set(1, 0);
		for(int i=2;i<n;i++)
		{
			for(int j=2;i*j<n;j++)
			{
				prime.set(i*j,0);
			}
		}
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		for(int i=0;i<prime.size();i++)
		{
			if(prime.get(i)==1)
			{
				primeList.add(i);
			}
		}
		
		return primeList;
		
	}
	
	public static ArrayList<Integer> getSum(int a)
	{
	//	ArrayList<Integer> primeList= getPrimeList(a);
		ArrayList<Integer> finalList =new ArrayList<Integer>();
		ArrayList<Integer> prime=new ArrayList<Integer>();
		HashMap<Integer,Integer> sum=new HashMap<Integer,Integer>();
		
		for(int i =0;i<a;i++)
		{
			prime.add(1);
		}
		prime.set(0, 0);
		prime.set(1, 0);
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			for(int j=2;i*j<a;j++)
			{
				prime.set(i*j,0);
			}
		}
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		for(int i=0;i<prime.size();i++)
		{
			if(prime.get(i)==1)
			{
				primeList.add(i);
				sum.put(i, 0);
			}
		}
		
		
		
		
		
		
		
		for(int i=0;i<primeList.size();i++)
		{
			int freq=0,freq1=0;
			int diff=a-primeList.get(i);
			if(sum.get(diff)!=null)
			{  
				freq=sum.get(diff);
				freq1=sum.get(primeList.get(i));
				if(freq==1&&freq1==1)continue;
				if(diff!=primeList.get(i))
				{
				finalList.add(primeList.get(i));
				finalList.add(diff);
				
				break;
				}
				else
				{
					finalList.add(diff);
					finalList.add(diff);
					break;
				}
				
			}
		}
		return finalList;
		
	}

}
