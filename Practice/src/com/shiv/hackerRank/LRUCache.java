package com.shiv.hackerRank;

import java.util.HashMap;


class Node
{
	int Key;
	int value;
	Node pre;
	Node next;
	
	Node(int key,int value)
	{
		this.Key=key;
		this.value=value;
	}
}

public class LRUCache {
	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head=null;
	Node end=null;
	
	public LRUCache(int capacity)
	{
		this.capacity=capacity;
	}
	
	public int get(int key)
	{
		if(map.containsKey(key))
		{
			Node n=map.get(key);
			remove(n);
			setHead(n);
			return n.value;
			
		}
		return -1;
	}
	
	public void setHead(Node n)
	{
		n.next=head;
		n.pre=null;
		
		if(head!=null)
			head.pre=n;
		
		head = n;
		 
        if(end ==null)
            end = head;
		
	}
	public void remove(Node n)
	{
		if(n.pre!=null)
		{
			n.pre.next=n.next;
		}
		else
		{
			head=n.next;
		}
		if(n.next!=null)
		{
			n.next.pre=n.pre;
		}
		else
		{
			end=n.pre;
		}
	}
	
	public void set(int key,int value)
	{
		if(map.containsKey(key))
		{
			Node old = map.get(key);
			old.value=value;
			remove(old);
			setHead(old);
		}
		else
		{
			Node created = new Node(key, value);
			if(map.size()>=capacity)
			{
				map.remove(end.Key);
				remove(end);
				setHead(created);
			}
			else
			{
				setHead(created);
			}
			map.put(key, created);
		}
	}
	
	public static void main(String[] args)
	{
		LRUCache cache = new LRUCache(1);
		cache.set(2, 1);
		System.out.println(cache.get(2));
		cache.set(3, 2);
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
	}
	

}

