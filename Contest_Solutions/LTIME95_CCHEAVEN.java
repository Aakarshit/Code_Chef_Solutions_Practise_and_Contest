import java.io.*;
import java.lang.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    FastReader sc=new FastReader();
	    int t=sc.nextInt();
	    while(t-->0){
	        int l=sc.nextInt();
	        String str=sc.nextLine();
	        if(l==1){
	            if(str.charAt(0)=='0'){
	                System.out.println("no");
	            }else{
	                System.out.println("Yes");
	            }
	        }else{
	            boolean flag=false;
	            int count=0;
	            int len=0;
	        for(int i=0;i<l;i++){
	            if(str.charAt(i)=='1'){
	                
	                count++;
	            }
	            len++;
	            if(check(count,len)){
	                System.out.println("yes");
	                flag=true;
	                break;
	            }
	        }
	        if(!flag){
	            System.out.println("no");
	        }}
	    }
	}
	public static boolean check(int count,int length){
	    
	    if(((count*100)/length)>=50){
	        return true;
	    }else{
	        return false;
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
