/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long a[]=new long[n];
		    long i=0;
		    for( i=0;i<n;i++){
		        a[(int)i]=sc.nextLong();
		    }
	    long ans=0;
	    long sum=0;
	  if(n==3){
	       System.out.println(Math.abs(a[0]-a[1])+Math.abs(a[1]-a[n-1])+Math.abs(a[n-1]-a[0]));
	  }else{
	      Arrays.sort(a);
	System.out.println(Math.max((Math.abs(a[0]-a[1])+Math.abs(a[1]-a[n-1])+Math.abs(a[n-1]-a[0])),(Math.abs(a[0]-a[n-2])+Math.abs(a[n-2]-a[n-1])+Math.abs(a[n-1]-a[0]))));
	  }
		}
	}
}
