/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   FastReader sc=new FastReader();
	   int t=sc.nextInt();
	   while(t-->0){
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       int sum=0;
	       boolean flag=true;
	       for(int i=0;i<n;i++){
	           arr[i]=sc.nextInt();
	       }
	       Arrays.sort(arr);
	       int check[]=new int[n];
	       for(int i=1;i<=n;i++){
	           check[i-1]=i;
	       }
	       for(int i=0;i<n;i++){
	           if(arr[i]>check[i]){
	               flag=false;
	               break;
	           }else{
	               sum += (check[i]-arr[i]);
	           }
	       }
	       
	       if(!flag){
	           System.out.println("Second");
	       }
	       else if(sum%2==0){
	           System.out.println("Second");
	       }else{
	           System.out.println("First");
	       }
	       
	   }
	}
		static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
