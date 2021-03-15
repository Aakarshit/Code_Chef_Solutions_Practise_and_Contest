import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		while(t-->0){
		    int n=sc.nextInt();
		    int e=sc.nextInt();
		    int h=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int min=Math.min(n,Math.min(e,h));
		    long ans=0;
		    long res=Long.MAX_VALUE;
		    long remegg=0;
		    long remchoc=0;
		    long remn=0;
		    for(long i=min;i>=0;i--){
		        remn=n-i;
		        remegg=e-i;
		        remchoc=h-i;
		        ans=c*i;
		        if(a<=b){
		            if(remn<=remegg/2){
		                ans+= remn*a;
		                remn=0;
		            }else{
		                ans+= remegg/2*a;
		                remn=remn-remegg/2;
		            }
		            if(remn<=remchoc/3){
		                ans+= remn*b;
		                remn=0;
		            }else{
		                ans+= remchoc/3*b;
		                remn=remn-remchoc/3;
		            }
		            if(remn==0){
		                if(ans<res){
		                    res=ans;
		                }
		            }
		        }else{
		            if(remn<=remchoc/3){
		                ans+= remn*b;
		                remn=0;
		            }else{
		                ans+= (remchoc/3)*b;
		                remn=remn-remchoc/3;
		            }
		            if(remn<=remegg/2){
		                ans+= remn*a;
		                remn=0;
		            }else{
		                ans+= (remegg/2)*a;
		                remn=remn-remegg/2;
		            }
		            if(remn==0){
		                if(ans<res){
		                    res=ans;
		                }
		            }
		        }
		    }
		    if(res==Long.MAX_VALUE){
		        sb.append(-1+"\n");
		    }else{
		       sb.append(res+"\n");
		    }
		}
		System.out.println(sb);
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