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
		    int s=sc.nextInt();
		    int q[]=new int[s];
		    for(int i=0;i<s;i++){
		       q[i]=sc.nextInt();
		    }
		    long ans=0;
		    for(int i=0;i<s;i++){
		        int k=sc.nextInt();
		        int p=q[i];
		        int arr[]=new int[k];
		        for(int j=0;j<k;j++){
		            arr[j]=sc.nextInt();
		        }
		        long temp=arr[0];
		        for(int j=1;j<arr.length;j++){
		            temp += Math.abs((arr[j]-p));
		        }
		        ans+=temp;
		    }
		    System.out.println(ans);
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
