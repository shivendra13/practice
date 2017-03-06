package com.shiv.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class ExactMatch {
	private static HashMap <Integer,String> map = new HashMap<Integer,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Hi How are you ? Today i was able to do a successfully payment very. Because of this payment i was able to send money to my friend.";
String str2="very payment successfully";
System.out.println(isExact(str1, str2));
	}

	public static boolean isExact(String str1,String str2)
	{

	String[] match=str2.split(" ");
	int lenght=match.length;
	
	int index=0;
	int count=0;
	//Pushing all the matching index in Map with the word
	for(String str:match)
	{
	    if(str1.contains(str))
	    {
	        index=str1.indexOf(str);
	        map.put(index, str);
	    }
	    
	      
	}
// Now iterating the map and checking the do the word are in sequence
	for(Map.Entry<Integer,String> itr: map.entrySet())
	{
		int in=itr.getKey();
		String word=itr.getValue();
		if(checkWordLength(in,word))
		{
			count++;
		}
		
	}
	//The count will always be less by 1 as last word will not have next matching string.
	if(count==lenght-1)
	return true;
	else
		return false;
}
	//Actual method for checking that the word are in sequence, as to get the next word index we can add current index+word lenght+ 1 for space.
	//If the matching index is found in map that means the word is in sequence.
	public static boolean checkWordLength(int index,String word)
	{
		int len =index+word.length()+1;
		if(map.containsKey(len))
		{
			return true;
		}
		return false;
		
	}
	
}
