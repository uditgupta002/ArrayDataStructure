import java.util.*;
import java.lang.*;
import java.io.*;

class EquilibriumPointInArray {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
	    for(int p=0;p<tests;p++){
	        int size = Integer.parseInt(br.readLine());
	        String vals[] = br.readLine().split(" ");
	        
	        if(size == 1){
	            System.out.println(1);
	            continue;
	        }
	        
	        int arr[] = new int[vals.length];
	        int sum = 0;
	        for(int i=0;i<vals.length;i++){
	            arr[i] = Integer.parseInt(vals[i]);
	            sum += arr[i];
	        }
	        int leftSum = arr[0];
	        int rightSum = sum-arr[0];
	        int curr = 1;
	        int element = Integer.MAX_VALUE;
	        while(curr < arr.length-2){
	            rightSum -= arr[curr];
	            //System.out.println("Left Sum="+leftSum+" Right Sum="+rightSum);
	            if(leftSum == rightSum)
	            {
	                element = curr;
	                break;
	            }
	            leftSum +=arr[curr];
	            curr++;
	        }
	        if(element != Integer.MAX_VALUE)
	            System.out.println(element+1);
	        else
	            System.out.println(-1);
        }
	}
}
