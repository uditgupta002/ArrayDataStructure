import java.util.*;
import java.lang.*;
import java.io.*;

class EqualityOfArrays {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++){
		    int size = Integer.parseInt(br.readLine());
		    String arr1[] = br.readLine().split(" ");
		    String arr2[] = br.readLine().split(" ");
		    Map<String,Integer> countMap = new HashMap<String,Integer>();
		    for(int j=0;j<size;j++){
		        if(countMap.get(arr1[j]) != null)
		            countMap.put(arr1[j],countMap.get(arr1[j]) + 1);
		        else
		            countMap.put(arr1[j],1);
		    }
		    boolean unequal = false;
		    for(String str : arr2){
		        if(countMap.get(str) == null || countMap.get(str) == 0){
		            unequal = true;
		            break;
		        } else {
		            countMap.put(str,countMap.get(str) - 1);
		        }
		        
		    }
		    if(unequal)
		        System.out.println(0);
		    else
		        System.out.println(1);
		}
	}
}

