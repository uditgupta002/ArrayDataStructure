import java.util.*;
import java.lang.*;
import java.io.*;

class StockBuySell {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tests = Integer.parseInt(br.readLine());
		for(int p=0;p<tests;p++){
		    Stack<String> s = new Stack<String>();
		    int size = Integer.parseInt(br.readLine().trim());
		    String vals[] = br.readLine().split(" ");
		    int arr[] = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i] = Integer.parseInt(vals[i]);
		    }
		    
		    int currentSell = size-1;
		    int i = size-1;
		    int j = size - 1;
		    while(i > 0 && j > 0){
		        
		        while(j > 0 && arr[j] < arr[j-1]){
		            j--;
		        }
		        currentSell = j;
		        i = j-1;
		        if(i >= 0){
		            while(i > 0 && arr[i] > arr[i-1])
		                i--;
		            s.push("("+i+" "+currentSell+")");
		        }
		        j = i-1;
		    }
		    if(s.isEmpty())
		        System.out.println("No Profit");
		    else{
		        while(!s.isEmpty())
		            System.out.print(s.pop()+" ");
		        System.out.println();
		    }
		      
		}
	}
}
