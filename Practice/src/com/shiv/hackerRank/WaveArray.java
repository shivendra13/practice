package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(4);
		wave(a);
		for(Integer i:a)
		{
			System.out.println(i);
		}
	}
	
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		
		int p=0;
		Collections.sort(a);
		for(int i=0;i<a.size()-1;i++)
		{
			if(p==0)
			{
				if(a.get(i)<=a.get(i+1))
				{
					int temp=a.get(i);
					a.set(i, a.get(i+1));
					a.set((i+1), temp);
				}
				p=1;
			}
			
			else if(p==1)
			{
				if(a.get(i)>=a.get(i+1))
				{
					int temp=a.get(i);
					a.set(i, a.get(i+1));
					a.set((i+1), temp);
				}
				p=0;
			}
			
		}
		
		
		return a;
		
		
	}

}
