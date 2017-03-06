package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixNeighbor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] s = new String[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.next();
	        }
	        ArrayList<String> temp= new ArrayList<String>();
	        temp.add(s[0]);
	        int j=0;
	        while(j<=n)
	        {
	        for(int i=0;i<temp.size();i++)
	        {
	        	if(s[j].startsWith(temp.get(i)))
	        	{
	        		temp.set(i, s[j]);
	        	}
	        	else
	        	{
	        		temp.add(s[j]);
	        	}
	        }
	        j++;
	        }
	        
	}

}
