import java.util.*;
import java.lang.*;
import java.io.*;

class SecondMostRepeatedStringInSequence {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++){
		    int size = Integer.parseInt(br.readLine());
		    String[] str = br.readLine().split(" ");
		    Map<String,Integer> strmap = new LinkedHashMap<String,Integer>();
		    for(int j=0;j<str.length;j++){
		        if(strmap.get(str[j]) != null)
		            strmap.put(str[j],strmap.get(str[j]) + 1);
		        else
		            strmap.put(str[j],1);
		    }
		    
		    //System.out.println(strmap);
		    
		    String maxKey = null;
		    int max = 0;
		    for(Map.Entry<String,Integer> e : strmap.entrySet()){
		        if(e.getValue() > max){
		            max = e.getValue();
		            maxKey = e.getKey();
		        }
		    }
		    
		    //System.out.println(maxKey);
		    
		    int secondMax = 0;
		    String secondMaxKey = null;
		    for(Map.Entry<String,Integer> e : strmap.entrySet()){
		        if(e.getValue() > secondMax && !e.getKey().equals(maxKey)){
		            secondMax = e.getValue();
		            secondMaxKey = e.getKey();
		            //System.out.println("Current secondMax Key="+secondMaxKey);
		        }
		    }
		    System.out.println(secondMaxKey);
		}
	}
}
