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
		    ArrayList<Integer> w=new ArrayList<>();
		    ArrayList<Integer> l=new ArrayList<>();
		    for(int i=0;i<n;i++){
		       w.add(sc.nextInt());
		    }
		    for(int i=0;i<n;i++){
		         l.add(sc.nextInt());
		    }
		    int ans=solve(n,w,l);
		    System.out.println(ans);
		    
	}}
	public static int solve(int n,ArrayList<Integer> w,ArrayList<Integer> l){
       ArrayList<Integer> arr=new ArrayList<>();
       for(int i:w){
           arr.add(i);
       }
       Collections.sort(arr);
       int count=0;
       int pos[]=new int[n];
       for(int i=0;i<n;i++){
           pos[i]=i;
       }
       for(int j=1;j<n;j++){
           int index=w.indexOf(arr.get(j));
           int p=pos[w.indexOf(arr.get(j-1))];
           int c=index;
           while(c<=p){
               c+=l.get(index);
               pos[index]=c;
               count++;
           }
       }
       return count;
	}

}
