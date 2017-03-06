package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] c=pascalTringle(10);
//		for(int i=0;i<c.length;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}
//		getRow(0);
		generate(5);


	}
	public static int[][] pascalTringle(int k)
	{
	//	ArrayList<Integer> a= new ArrayList<Integer>();
		int[][] b= new int[k][k];
		b[0][0]=1;
		for(int i=1;i<k;i++)
		{
			int[] a=new int[i+1];
			for(int j=0;j<=i;j++)
			{
				if(i==j || j==0)
				{
					b[i][j]=1;
				}
				else
				{
					b[i][j]=b[i-1][j]+b[i-1][j-1];
				}
				
				if(i==k-1)
				{
					a[j]=b[i][j];
				}
			}
		}
		return b;
	}
	
	
	
public static ArrayList<Integer> getRow(int a) {
	    
	    
    	ArrayList<Integer> c= new ArrayList<Integer>();
    	int size=a+1;
		int[][] b= new int[size][size];
		b[0][0]=1;
		for(int i=0;i<size;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				if(i==j || j==0)
				{
					b[i][j]=1;
				}
				else
				{
					b[i][j]=b[i-1][j]+b[i-1][j-1];
				}
				
				if(i==a)
				{
					c.add(b[i][j]);
				}
			}
		}
		return c;
	
	}

public static ArrayList<ArrayList<Integer>> generate1(int a) {
    
    
	ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(1);
	for(int i=0;i<a;i++)
	{
	    int val=0;
	    int last=0;
		for(int j=0;j<i+1;j++)
		{ 
		    val=b.get(j);
			if(j-1>=0)
			 val=val+last;
			
			 last=b.get(j);
			 b.set(j,val);
		}
		b.add(b.get(0));
		res.add(b);
	}
	return res;

}

public static ArrayList<ArrayList<Integer>> generate(int a)
{
	ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
	int[][] b= new int[a][a];
	b[0][0]=1;
	for(int i=1;i<a;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(i==j || j==0)
			{
				b[i][j]=1;
			}
			else
			{
				b[i][j]=b[i-1][j]+b[i-1][j-1];
			}
			
		}
	}
	   
	    for(int i=0;i<a;i++)
	    {   ArrayList<Integer> res= new ArrayList<Integer>();
	        for(int j=0;j<a;j++)
	        {
	            if(b[i][j]>0)
	            res.add(b[i][j]);
	            else
	            break;
	        }
	        result.add(res);
	    }
	    
	return result;
}

	
	

}
