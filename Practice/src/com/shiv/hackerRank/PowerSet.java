package com.shiv.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s={3,3,9,9,5};
		subsets(s);

	}

	public static ArrayList<ArrayList<Integer>> powerSets(int[] S) {
		if (S == null)
			return null;
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if (S == null)
			return null;
	 
		//Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 int skip=0;
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			skip=result.size()-i;
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				if(skip>0)
				{	skip--;
					continue;
				}
				else
				{
				temp.add(new ArrayList<Integer>(a));
				}
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
}
