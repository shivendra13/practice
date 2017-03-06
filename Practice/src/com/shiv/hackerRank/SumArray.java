package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class SumArray {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(-1);
		a.add(-1);
		a.add(-1);
		a.add(-1);
		//a.add(2);
		//a.add(3);
		maxset(a);
	}
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long sum_l=0,sum_g=Integer.MIN_VALUE;
	    int start=0,end=0,start_g=0,end_g=0;
	    int len=0,len_g=0;
	    ArrayList<Integer> b= new ArrayList<Integer>();
	    for(int i=0;i<a.size();i++)
	    {
	    	
	    	if(a.get(i)<0)
	    	{
	    		sum_l=0;
	            start=i+1;
                end=i;
                len=0;
                
	    	}
	        else
	        {
	        	 sum_l=sum_l+a.get(i);
	        	 len++;
	            
	        }
	        if(sum_g<sum_l||(sum_l==sum_g && len>len_g))
            {
                sum_g=sum_l;
                end=i;
                start_g=start;
                end_g=end;
                len_g=len;
            
            }
	    }
//	    if(count==a.size())
//	    {
//	    	start_g=0;
//	    	end_g=-1;
//	    }
	   
	    for(int i=start_g;i<=end_g;i++)
	    {
	    	b.add(a.get(i));
	    }
	    
		return b;
	    
	}

}
