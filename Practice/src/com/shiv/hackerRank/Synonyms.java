package com.shiv.hackerRank;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;

public class Synonyms {

	private HashMap<String, LinkedList<String>> map=new  HashMap<String, LinkedList<String>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synonyms synonyms= new Synonyms();
		String[] a1={"word2", "word10", "word20"};
		String[] a2={"word3"};
		String[] a3={"word5"};
		String[] a4={"word6"};
		synonyms.add("word1", a1);
		synonyms.add("word2", a2);
		synonyms.add("word3", a3);
		synonyms.add("word4", a4);
	System.out.println(synonyms.isSynonyms("word1", "word5"));
		
		
	}
	
	
	public void add(String key,String[] values)
	{
		LinkedList<String> list=new LinkedList<>();
		for(String val:values)
		{
			list.add(val);
		}
		map.put(key, list);
	}
	
	public boolean isSynonyms(String str1, String str2)
    {
		
		boolean done = false;
		boolean isTransitive = false;
		LinkedList<String> temp=map.get(str1);
		while(!done)
		{
			if(map.containsKey(str1))
			{
				temp=map.get(str1);
				if(!temp.contains(str2))
				{
					for(String s:temp)
					{
						if(map.containsKey(s))
						{
							str1=s;
							break;
						}
						else
						{
							done=true;
							isTransitive=false;
						}
					}
				}
				else
				{
					done=true;
					isTransitive=true;
				}
			}
		}
	
        return isTransitive;
        
    }

}
