/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    FastReader sc=new FastReader();
	   int t=sc.nextInt();
	 
	   while(t-->0){
	   String p=sc.nextLine();
	   int n=sc.nextInt();
	   String arr[]=new String[n];
	   for(int i=0;i<n;i++){
	       arr[i]=sc.nextLine();
	   }
	   String ans="";
	   for(int i=0;i<n;i++){
	       boolean check=solve(p,arr[i]);
	       if(check){ 
	           ans+="1";
	       }else{
	           ans+="0";
	       }
	   }
	   ans=ans.trim();
	   System.out.println(ans);
	  
	   }
	}
	
	public static boolean solve(String s, String str){
	  String str1=str.substring(0,5)+":00"+str.substring(5,8);
	  String str2=str.substring(9,14)+":00"+str.substring(14);
	  String time=s.substring(0,5)+":00"+s.substring(5);
	     LocalTime start = LocalTime.parse(str1,
            DateTimeFormatter.ofPattern("hh:mm:ss a"));
	
          LocalTime stop = LocalTime.parse(str2,
            DateTimeFormatter.ofPattern("hh:mm:ss a"));
             LocalTime target = LocalTime.parse(time,
            DateTimeFormatter.ofPattern("hh:mm:ss a"));
    
    if(str1.equals(time)||str2.equals(time)){
        return true;
    }     
	if(target.isAfter(start) && target.isBefore(stop)){
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
