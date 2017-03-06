package com.shiv.hackerRank;

public class MergeSort {
	
	public static void main(String [] args)
	{
		int []a = {1, 2, 10, 20, 40, 32, 44, 51, 6};
	}
	
	public static void merge_sort(int[] a,int start,int end)
	{
		if(start<end){
		int mid=(start+end)/2;
		merge_sort(a,0,mid);
		merge_sort(a,mid+1,end);
		
		merge(a,start,mid,end);
		}
		
	}
	
	public static void merge(int[] a,int start,int mid,int end)
	{
		int[] arr=new int[end-start+1];
		int k=0;int p = start ,q = mid+1;
		
		 	for(int i=start;i<end;i++)
		 	{
		 		if(p>mid)
		 		{
		 			arr[k++]=a[q++];
		 		}
		 		else if(q>end)
		 		{
		 			arr[k++]=a[p++];
		 		}
		 		else if(a[p]>a[q])
		 		{
		 			a[k++]=a[p++];
		 		}
		 		else
		 		{
		 			a[k++]=a[q++];
		 		}
		 	}
	}

}
