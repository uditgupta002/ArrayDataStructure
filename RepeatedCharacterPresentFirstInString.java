import java.util.*;
import java.lang.*;
import java.io.*;

class RepeatedCharacterPresentFirstInString {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++){
		    String str = br.readLine();
		    Map<Character,Integer> charmap = new LinkedHashMap<Character,Integer>();
		    for(int j=0;j<str.length();j++){
		        if(charmap.get(str.charAt(j)) != null)
		            charmap.put(str.charAt(j),charmap.get(str.charAt(j)) + 1);
		        else
		            charmap.put(str.charAt(j),1);
		    }
		    Character key = null;
		    for(Map.Entry<Character,Integer> e : charmap.entrySet()){
		        if(e.getValue() > 1){
		            key = e.getKey();
		            break;
		        }
		    }
		    if(key != null)
		        System.out.println(key);
		    else
		        System.out.println(-1);
		}
	}
}
