package com.shiv.array;

import java.util.ArrayList;
import java.util.List;

public class FindOneInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<>();
		a.add(5);
		a.add(5);
		a.add(5);
		a.add(8);
//		a.add(4);
//		a.add(4);
//		a.add(1);
		System.out.println(getSingle(a));

	}

	public static int getSingle(final List<Integer> a)
	{

		int firstTimeOccurence = 0;
		  int secondTimeOccurence = 0;
	    if(a.size()==0) return 0;
	   
	    if(a.size()==1) return a.get(0);
	    else{
	    	for(int i=0;i<a.size();i++)
	    	{
	    		 secondTimeOccurence =  secondTimeOccurence | (firstTimeOccurence & a.get(i));
	    		   firstTimeOccurence = firstTimeOccurence ^ a.get(i); 
	    		   int neutraliser = ~(firstTimeOccurence & secondTimeOccurence);
	    		   firstTimeOccurence = firstTimeOccurence & neutraliser;
	    		   secondTimeOccurence = secondTimeOccurence & neutraliser;
	    	}
	    	
	    	
	    }
	    return firstTimeOccurence;
	
	}
}
