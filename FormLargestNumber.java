import java.util.*;
import java.lang.*;
import java.io.*;

class FormLargestNumber {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0;i<testCases;i++){
		    int size = Integer.parseInt(br.readLine());
		    String temp[] = br.readLine().split(" ");
		    Arrays.sort(temp,new Comparator<String>(){
		       public int compare(String s1, String s2){
		           
		           String str1 = s1 + s2;
		           String str2 = s2 + s1;
		           return str2.compareTo(str1);
		       }
		    });
		    StringBuffer buffer = new StringBuffer();
		    for(String str : temp){
		        buffer.append(str);
		    }
		System.out.println(buffer.toString());
		}
	}
}
