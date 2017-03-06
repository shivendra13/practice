package com.shiv.hackerRank;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(5);
		System.out.println(sumBitDifferences(a));
	}

	
	public static int cntBits(ArrayList<Integer> A) {
		int diffSum=0;
		if(A.size()==0) return diffSum;
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<A.size();j++)
			{
				if(i!=j)
				diffSum+=diffCnt(A.get(i), A.get(j));
			}
		}
		
		return diffSum;
    }
	
	private static int diffCnt(int a,int b)
	{
		int x=0,diff=0;
		for(int i=0;i<32;i++)
		{
			x=1<<i;
			if((a&x)!=(b&x))
				diff++;
		}
		return diff;
	}
	
	
	static int sumBitDifferences(ArrayList<Integer> A)
	{
	    int ans = 0;  // Initialize result
	    long M = (long) (Math.pow(10,9)+7);
	    System.out.println(M);
	    // traverse over all bits
	    for (int i = 0; i < 32; i++)
	    {
	        // count number of elements with i'th bit set
	        int count = 0;
	        for (int j = 0; j < A.size(); j++)
	            if ( (A.get(j) & (1 << i))!=0 )
	                count++;
	 
	        // Add "count * (n - count) * 2" to the answer
	        ans += (count * (A.size() - count) * 2);
	        ans=(int) (ans%M);
	    }
	 
	    
	    return ans;
	}
}
