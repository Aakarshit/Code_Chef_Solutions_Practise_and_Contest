import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    static int cnt[]=new int[1000000+1];
    static boolean prime[]=new boolean[1000000+1];
    public static void main (String[] args) throws java.lang.Exception
	{
	    FastReader sc=new FastReader();
		int t=sc.nextInt();
	
		StringBuilder sb=new StringBuilder();
		check();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(cnt[x]>y){
		       sb.append("Divyam\n");
		    }else{
		        sb.append("Chef\n");
		    }
	}
	System.out.println(sb);
	}
	public static  void check(){
	   
	    for(int i=2;i*i<=1000000;i++){
	        if(prime[i]==false){
	            for(int j=i*i;j<=1000000;j+=i){
	                prime[j]=true;
	            }
	        }
	    }
	    int count=0;
	    for(int i=2;i<=1000000;i++){
	        if(prime[i]==false){
	            count++;
	        }
	        cnt[i]=count;
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
