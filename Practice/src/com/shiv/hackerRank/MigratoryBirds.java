package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int length=input.nextInt();
//		for(int i=0;i<length;i++)
//		{
//			a.add(input.nextInt());
//		}
		 int[] a = new int[length];
	        for(int types_i=0; types_i < length; types_i++){
	            a[types_i] = input.nextInt();
	        }
		
		System.out.println(maxCount(a));

	}
	
	public static int maxCount( int[]  a)
	{
		int max_g=0;int key=0;
		HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
		for(Integer i:a)
		{
			if(map.containsKey(i))
			{
				int freq=map.get(i);
				freq++;
				map.put(i, freq);
			}
			else
			{
				map.put(i, 1);
			}
		}
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			int max=0;
			max=e.getValue();
			if(max>max_g)
			{
				max_g=max;
				key=e.getKey();
				
			}
			else if(max==max_g)
			{
				key=(key<e.getKey()?key:e.getKey());
			}
		}
		return key;
		
	}

}
