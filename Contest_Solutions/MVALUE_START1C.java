import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader sc=new FastReader();
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int a=arr[n-1];
	    int b=arr[n-2];
	    int c=arr[0];
	    int d=arr[1];
	    BigInteger ans1=new BigInteger("1");
	    ans1=ans1.multiply(BigInteger.valueOf(a));
	    ans1=ans1.multiply(BigInteger.valueOf(b));
	    ans1=ans1.add(BigInteger.valueOf(a));
	    ans1=ans1.subtract(BigInteger.valueOf(b));
	    BigInteger ans2=new BigInteger("1");
	    ans2=ans2.multiply(BigInteger.valueOf(c));
	    ans2=ans2.multiply(BigInteger.valueOf(d));
	    ans2=ans2.add(BigInteger.valueOf(d));
	    ans2=ans2.subtract(BigInteger.valueOf(c));
	  if(ans1.compareTo(ans2)<0){
	      System.out.println(ans2);
	  }else{
	   System.out.println(ans1);   
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
