package com.shiv.hackerRank;

import java.util.ArrayList;

public class AntiDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(1);b.add(2);b.add(3);
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(4);c.add(5);c.add(6);
		ArrayList<Integer> d= new ArrayList<Integer>();
		d.add(7);d.add(8);d.add(9);
		a.add(b);a.add(c);a.add(d);
		AntiDiagonal antiDiagonal= new AntiDiagonal();
		ArrayList<ArrayList<Integer>> res=antiDiagonal.diagonal(a);
		antiDiagonal.printList(res);
		
	}
	
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		for(int d=0;d<=2*(a.size()-1);d++)
		{
			ArrayList<Integer> res= new ArrayList<Integer>();
			for(int j=0;j<=d;j++)
			{
				if(j<a.size() && d-j <a.size())
					res.add(a.get(j).get(d-j));
				
				
			}	
			result.add(res);			
		}
		
		
		
		return result;
		
	}
	
	public void printList(ArrayList<ArrayList<Integer>> a)
	{
		for(ArrayList<Integer> i:a)
			System.out.println(i);
	}

}
