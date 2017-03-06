package com.shiv.hackerRank;

public class PalendronString {
	
	public static void main(String[] args)
	{
		String a="\\*\\&";
		isPalendron(a);
		int count=0;
		StringBuilder  builder= new StringBuilder();
		for(int i =0;i<a.length();i++)
		{
			if((a.charAt(i)>='a' && a.charAt(i)<='z')||(a.charAt(i)>='A' && a.charAt(i)<='Z')||(a.charAt(i)>='0' && a.charAt(i)<='9'))
				builder.append(Character.toLowerCase(a.charAt(i)));
		}
		
		int size=builder.length()-1;
		for(int i=0;i<(builder.length()/2);i++)
		{
			if(builder.charAt(i)==builder.charAt(size))
				count++;
			if(size>builder.length()/2)
				size--;
		}
		if(count==size)
			System.out.println(true);
		else
			System.out.println(false);
	}
	
public static int isPalendron(String a)
{
	StringBuilder strBuf= new StringBuilder();
	for(int i =0;i<a.length();i++)
	{
		if((a.charAt(i)>='a' && a.charAt(i)<='z')||(a.charAt(i)>='A' && a.charAt(i)<='Z')||(a.charAt(i)>='0' && a.charAt(i)<='9'))
			strBuf.append(Character.toLowerCase(a.charAt(i)));
	}
	String str=strBuf.toString();
	int n=str.length();
	for(int i=0;i<n/2;i++)
	{
		if(str.charAt(i)!=str.charAt(n-i-1))
			return 0;
	}
	
	return 1;
	
}
	
	
	

}
