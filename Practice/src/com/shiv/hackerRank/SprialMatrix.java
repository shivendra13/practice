package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> b = new ArrayList<Integer>();
		 b.add(1);
		 b.add(2);
		 ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(3);
		b1.add(4);
		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(5);
		b2.add(6);
		List<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		a.add(b);
		a.add(b1);
		a.add(b2);
		//spiralOrder(a);
		spiralLeftOrder(a);
	}

	
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int n= a.get(0).size()-1;
		 int T=0,B=a.size()-1,R=n,L=0;
		 int dir=0;
		 while(T<=B && L<=R)
		 {
			 if(dir==0)
			 {
				 for(int i=L;i<=R;i++)
					 result.add(a.get(T).get(i));
				 T++;
				 dir++;
			 }
			 else if(dir==1)
			 {
				 for(int i=T;i<=B;i++)
					 result.add(a.get(i).get(R));
					 R--;
					 dir++;
			 }
			 else if(dir==2)
			 {
				 for(int i=R;i>=L;i--)
					 result.add(a.get(B).get(i));
					 B--;
					 dir=3;
			 }
			 else if(dir==3)
			 {
				 for(int i=B;i>=T;i--)
					 result.add(a.get(i).get(L));
					 L++;
					 dir=0;
			 }
			 
		 }
		 
		 
		 return result;
	}
	
	public static ArrayList<Integer> spiralLeftOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int n= a.get(0).size()-1;
		 int T=0,B=a.size()-1,R=n,L=0;
		 int dir=0;
		 while(T<=B && L<=R)
		 {
			 if(dir==0)
			 {
				 for(int i=R;i>=L;i--)
					 result.add(a.get(T).get(i));
				 T++;
				 dir++;
			 }
			 else if(dir==1)
			 {
				 for(int i=T;i<=B;i++)
					 result.add(a.get(i).get(L));
					 L++;
					 dir++;
			 }
			 else if(dir==2)
			 {
				 for(int i=L;i<=R;i++)
					 result.add(a.get(B).get(i));
					 B--;
					 dir=3;
			 }
			 else if(dir==3)
			 {
				 for(int i=B;i>=T;i--)
					 result.add(a.get(i).get(R));
					 R--;
					 dir=0;
			 }
			 
		 }
		 
		 
		 return result;
	}
}
