import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 BufferedReader sc = new BufferedReader (new InputStreamReader(System.in));
        int t= Integer.parseInt(sc.readLine());
		while(t-->0){
		    int n=Integer.parseInt(sc.readLine());
		    String[] arr = sc.readLine().split(" ");
		  int ans=solve(arr);
		  System.out.println(ans);
	}
	    
	}
public static int solve(String[] funnyStrings) {
  int ret = 0;
  Map<String, Set<Character>> SuffixMap = new HashMap<>(funnyStrings.length);
  for(String s: funnyStrings) {
   if(SuffixMap.containsKey(s.substring(1)))
    SuffixMap.get(s.substring(1)).add(s.charAt(0));
   else {
    Set<Character> temp = new HashSet<>();
    temp.add(s.charAt(0));
    SuffixMap.put(s.substring(1), temp);
   }
  }
  
  
  String keys[] = SuffixMap.keySet().stream().toArray(String[]::new);
  for(int i= 0;i < keys.length-1; i++) {
   for(int j =i+1; j< keys.length;j++){
    Set<Character> union = new HashSet<>(SuffixMap.get(keys[i]));
    union.addAll(SuffixMap.get(keys[j]));
    ret += (union.size() - SuffixMap.get(keys[i]).size()) * (union.size() - SuffixMap.get(keys[j]).size()); 
   }
  }
  return ret*2;
 }
}
