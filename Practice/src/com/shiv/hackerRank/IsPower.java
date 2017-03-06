package com.shiv.hackerRank;

public class IsPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPower(9));

	}
	public static boolean isPower(int a) {
		
		if(a==1) 
			{
			System.out.println("Values are 1^1 = "+a);
			return true;
			}
		
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			for(int j=2;Math.pow(i, j)<=a;j++)
			{
				if(Math.pow(i, j)==a){
					System.out.println("Values are "+i+"^"+j+" = "+a);
					return true;
				}
			}
		}
		
		return false;
    }
}
