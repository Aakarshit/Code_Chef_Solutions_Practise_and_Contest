import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    static final int mod=1000000007;
	public static void main (String[] args) {
	    FastReader sc=new FastReader();
	    int n=sc.nextInt();
	    
	    
	    long sum=0l;
	    for(int i=0;i<n;i++){
	        long temp=sc.nextLong();
	        sum+=temp;
	        sum=(sum+mod)%mod;
	    }
	   sum%=mod;
	    long q=sc.nextLong();
	    int qrr[]=new int[(int)q];
	    for(int i=0;i<q;i++){
	        qrr[i]=sc.nextInt();
	    }
	    StringBuilder ans=new StringBuilder();
	   while(q-->0){
	      sum=(sum*2)%mod;
	     ans.append(sum+"\n");
	   }
	   System.out.println(ans);
	    
	    
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