import java.util.*;
import java.lang.*;
import java.io.*;

class LargestSumContigiousSubarray {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int i=0;i<testCases;i++){
	        int size = Integer.parseInt(br.readLine());
	        String[] tempArr = br.readLine().split(" ");
	        int arr[] = new int[size];
	        for(int j=0;j<size;j++)
	            arr[j] = Integer.parseInt(tempArr[j]);
	        int currentSum = arr[0];
	        int ptr = 1;
	        int lowerPtr = 0;
	        int higherPtr = 0;
	        int maxSum = arr[0];
	        int s = 0;
	        while(ptr < size){
	            
	            if((currentSum + arr[ptr]) > arr[ptr]){
	                currentSum += arr[ptr]; 
	            } else {
	                currentSum = arr[ptr];
	                s = ptr;
	            }
	            
	            
	            if(currentSum > maxSum){
	                maxSum = currentSum;
	                higherPtr = ptr;
	                lowerPtr = s;
	            }
	                
	            ptr++;
	        }
	        System.out.println("Array Starts from "+lowerPtr+" and Ends at "+higherPtr);
	        System.out.println(maxSum);
	    }
	}
}
