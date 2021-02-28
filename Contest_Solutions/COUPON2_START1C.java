
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
		    int d=sc.nextInt();
		    int c=sc.nextInt();
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int a3=sc.nextInt();
		    int b1=sc.nextInt();
		    int b2=sc.nextInt();
		    int b3=sc.nextInt();
		    int sum1=a1+a2+a3+b1+b2+b3+d+d;
		    int sum2=c;
		    if((a1+a2+a3)>=150){
		        sum2=sum2+a1+a2+a3;
		    }else{
		        sum2=sum2+a1+a2+a3+d;
		    }
		    if((b1+b2+b3)>=150){
		        sum2=sum2+b1+b2+b3;
		    }else{
		        sum2=sum2+b1+b2+b3+d;
		    }
		    if(sum2<sum1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
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
