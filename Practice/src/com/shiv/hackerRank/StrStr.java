package com.shiv.hackerRank;

public class StrStr {
	
	final static int PRIME=17;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa"));
System.out.println(patternSearch("babaaa".toCharArray(),"bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba".toCharArray()));
		
		reverse(366245711);

	}
	
	public static int strStr(final String haystack, final String needle) {
		
		if(haystack==null || needle==null)
			return -1;
		else
		{
			int j=0;
			for(int i=0;i<haystack.length();i++)
			{
				if(haystack.charAt(i)==needle.charAt(j))
				{
					j++;
					if(j==needle.length())
						return i-j;
				}
				else
				{
					j=0;
				}
			}
		}
		return -1;
		
	}
	
	
	public static int patternSearch(char[] pattern,char[] text)
	{
		int m=pattern.length;
		int n=text.length;
		
		long patternHash=getHash(pattern,m-1);
		long textHash=getHash(text,m-1);
		for(int i=1;i<=n-m+1;i++)
		{
			if(patternHash==textHash && checkEquals(text,i-1,i+m-2,pattern,0,m-1))
				return i-1;
			else
			{
				textHash=recalcuate(text,i-1,i+m-1,textHash,m);
						
			}
		}
		return -1;
		
	}

	private static long recalcuate(char[] text, int i, int j, long textHash, int m) {
		// TODO Auto-generated method stub
		long hash=textHash-text[i];
		hash=hash/PRIME;
		hash+=text[j]*Math.pow(PRIME, m-1);
		return hash;
	}

	private static int getHash(char[] pattern,int end) {
		// TODO Auto-generated method stub
		int hash=0;
		for(int i=0;i<=end;i++)
		{
			hash+=pattern[i]*Math.pow(PRIME, i);
			
		}
		return hash;
	}
	private static boolean checkEquals(char[] text,int start ,int end,char[] pattern,int start1,int end1)
	{
		if(end-start!=end1-start1)
			return false;
		while(start<=end && start1<=end1)
		{
			if(text[start]!=pattern[start1])
				return false;
		
		start++;
		start1++;
		}
		return true;
	}
	
	public static int reverse(int a) {
	    long reverse=0;
	    if(a<0)
	    for(int i=a;i!=0;i=i/10)
	   {
	       int rem=i%10;
	       reverse=reverse*10+rem;
	   }
	   
	   if(reverse<Integer.MAX_VALUE && reverse>Integer.MIN_VALUE)
	   {
		   return (int)reverse;
	   }
	   else
	   return 0;
	}


}
