package com.shiv.hackerRank;

public class BinaryConversion {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=4;
		BinaryConversion  con=new BinaryConversion();
		//con.numSetBits(a);
		con.reverse(a);
//		long sum=0;
//		StringBuilder builder= new  StringBuilder();
//		while(a>1)
//		{
//			long rem=a%2;
//			a=a/2;
//			builder.append(String.valueOf(rem));
//		}
//		builder.append(String.valueOf(a));
//		if(builder.length()<32)
//		{
//			int diff=31-builder.length();
//			while(diff>=0)
//			{
//				builder.append(0);
//				diff--;
//			}
//		}
//		String ex=builder.toString();
//		for(int i=0;i<ex.length();i++)
//		{
//			if(ex.charAt(i)=='1')
//			{
//				sum=(long) (sum+Math.pow(2, (31-i)));
//			}
//		}
//		System.out.println(sum);
	}
	
public int numSetBits(long A) {
	    
	    int count = 0;
	    
	    while (A > 0) {
	        if ( (A & 1) != 0)
	            count++;
	        A >>= 1;
	    }
	    
	    return count;
	    
	}
	
public long reverse(long A) {
    long rev = 0;
    
    for (int i = 0; i < 32; i++) {
        rev <<= 1;
        if ((A & (1 << i)) != 0)
            rev |= 1;
    }
    
    return rev;
    
}
	

}
