import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		   
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        b[i]=a[i];
		    }
		   int ans[]=new int[n];
		   Arrays.sort(b);
		   int c=1;
		   int r=-1;
		   for(int i=n-1;i>=0;i--){
		       if(b[i]==r){
		           continue;
		       }
		       for(int j=0;j<n;j++){
		           if(b[i]==a[j]){
		               ans[j]=c;
		               c++;
		           }
		       }
		       r=b[i];
		   }
		   
		    StringBuilder sb=new StringBuilder();
		    for(int i:ans){
		        sb.append(i+" ");
		    }
		    System.out.println(sb);
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
