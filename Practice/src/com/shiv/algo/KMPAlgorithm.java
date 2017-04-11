package com.shiv.algo;

public class KMPAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        KMPAlgorithm ss = new KMPAlgorithm();
        boolean result = ss.KMP(str.toCharArray(), subString.toCharArray());
System.out.print(result);
	}
	
	public boolean KMP(char[] text,char[] pattern)
	{
		int[] lps=computTempArray(pattern);
		int i=0,j=0;
		while(i<text.length && j<pattern.length)
		{
			if(text[i]==pattern[j])
			{
				i++;
				j++;
			}
			else
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
					i++;
			}
		}
		if(j == pattern.length){
            return true;
        }
return false;
	}

	private int[] computTempArray(char[] pattern)
	{
		int[] lps=new int[pattern.length];
		int index=0;
		for(int i=1;i<lps.length;i++)
		{
			if(pattern[i]==pattern[index])
			{
				lps[i]=index+1;
				index++;
			}
			else
			{
				if(index!=0)
				{
					index=lps[index-1];
				}
				else
				{
					lps[i] =0;
				}
			}
		}
		return lps;
	}
	
}
