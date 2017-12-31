import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;
class SortWithFrequency {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for(int tests = 0;tests < testCases;tests++){
		    int size = Integer.parseInt(br.readLine());
		    String temp[] = br.readLine().split(" ");
		    int arr[] = new int[size];
		    HashMap<String,Integer> map = new HashMap<String,Integer>();
		    //int freq[] = new int[130];
		    //Arrays.fill(freq,0);
		    for(int i=0;i<size;i++){
		        //arr[i] = Integer.parseInt(temp[i]);
		        //freq[arr[i]]++;
		        if(map.get(temp[i]) != null){
		            map.put(temp[i],map.get(temp[i])+1);
		        } else
		            map.put(temp[i],1);
		    }
		    List<Entry<String,Integer>> list = getList(map);
		    for(Entry<String,Integer> e1 : list){
		        printValues(e1.getKey(),e1.getValue());
		    }
		    System.out.println();
		}
	}
	
	public static void printValues(String key,Integer value){
	    for(int i=0;i<value;i++){
	        System.out.print(key+" ");
	    }
	}
	
	public static List<Entry<String,Integer>> getList(HashMap<String,Integer> map){
	    
	    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	    Collections.sort(list,new Comparator<Entry<String,Integer>>(){
	       
	       public int compare(Entry<String,Integer> e1,Entry<String,Integer> e2){
	                if( e1.getValue() == e2.getValue()){
	                    return Integer.parseInt(e1.getKey()) - Integer.parseInt(e2.getKey());
	                } else
	                    return e2.getValue() - e1.getValue();
	       } 
	    });
	    return list;
	}
	
	
}
