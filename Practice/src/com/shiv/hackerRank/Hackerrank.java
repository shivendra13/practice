package com.shiv.hackerRank;

import java.util.Scanner;

public class Hackerrank {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner in = new Scanner(System.in);
		  char[] c={'h','a','c','k','e','r','r','a','n','k'};
	        int q = in.nextInt();
	        
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            int j=0;
	            // your code goes here
	            for(int i=0;i<s.length();i++)
	            {
	            	if(s.charAt(i)==c[j])
	            	{
	            		j++;
	            		 if(j==c.length){
	            			 break;
	            		 }
	            	}
	            }
	            if(j==c.length)
	            	System.out.println("YES");
	            else
	            	System.out.println("NO");
	        }
	}
}
