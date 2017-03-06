package com.shiv.hackerRank;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("  the   sky is blue   "));
	}
	public static String reverseWords(String a) {
		StringBuilder build=new StringBuilder();
		if(a==null) return a;
		int wordLength=0,start=0;;
		for(int i=a.length()-1;i>=0;i--)
		{
		if(a.charAt(i)==' ')
			{
				if(wordLength>0)
				{
					build.append(a.substring(start, start+wordLength));
					wordLength=0;
				
				build.append(a.charAt(i));}
				
			}
			else
			{
				start=i;
				wordLength++;
				
			}
		}
		if(wordLength>0)
		{
			build.append(a.substring(start, start+wordLength));
			wordLength=0;
		
		}
		String result=build.toString();
		if(result!=null && result.charAt(result.length()-1)==' ')
		{
			result=result.substring(0, result.length()-1);
		}
		
		return result;
	}

}
