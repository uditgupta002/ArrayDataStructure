import java.util.*;
import java.lang.*;
import java.io.*;

class LeadersInArray {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
	    for(int p=0;p<tests;p++){
	        Stack<Integer> s = new Stack<Integer>();
	        int size = Integer.parseInt(br.readLine());
	        String vals[] = br.readLine().split(" ");
	        int maxSoFar;
	        int arr[] = new int[vals.length];
	        int sum = 0;
	        for(int i=0;i<vals.length;i++){
	            arr[i] = Integer.parseInt(vals[i]);
            }
            int count = 0;
            maxSoFar = -1;
            for(int i=size-1;i>=0;i--){
                if(arr[i]>maxSoFar){
                    s.push(arr[i]);
                    count++;
                    maxSoFar = arr[i];
                }
            }
            while(!s.isEmpty())
                System.out.print(s.pop()+" ");
            System.out.println();
	    }
    }
    
    
}
