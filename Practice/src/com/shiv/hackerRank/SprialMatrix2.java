package com.shiv.hackerRank;
import java.util.ArrayList;

public class SprialMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrix(3);

	}
	
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		int T=0,L=0,R=a-1,B=a-1;
		int dir=0;
		int j=1;
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		int [][] b=new int[a][a];
		while(T<=B && L<=R)
		{
			if(dir==0)
			{
				for(int i=L;i<=R;i++)
					b[T][i]=j++;
				
				T++;
				dir=1;
			}
			if(dir==1)
			{
				for(int i=T;i<=B;i++)
					b[i][R]=j++;
			R--;
			dir=2;
			}
			if(dir==2)
			{
				for(int i=R;i>=L;i--)
					b[B][i]=j++;
				B--;
				dir=3;
			}
			if(dir==3)
			{
				for(int i=B;i>=T;i--)
					b[i][L]=j++;
				L++;
				dir=0;
			}
		}
		
		for(int i=0;i<a;i++)
		{ ArrayList<Integer> res=new ArrayList<Integer>();
			for(int j1=0;j1<a;j1++)
			{
				res.add(b[i][j1]);
			}
			result.add(res);
		}
		
		
		return result;
	}

}
