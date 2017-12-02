import java.util.*;
import java.lang.*;
import java.io.*;

class MaxIncreasingSubSum {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
	    for(int p=0;p<tests;p++){
	        int size = Integer.parseInt(br.readLine());
	        String vals[] = br.readLine().split(" ");
	        
	        int arr[] = new int[vals.length];
	        int sum = 0;
	        for(int i=0;i<vals.length;i++){
	            arr[i] = Integer.parseInt(vals[i]);
            }
            System.out.println(findLIS(arr));
            
            
	    }
    }
    
    public static int findLIS(int[] arr){
        int max = arr[0];
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && temp[j] + arr[i] > temp[i]){
                    temp[i] = temp[j] + arr[i];
                }
            }
            if(temp[i] > max)
                max = temp[i];
        }
        return max;
        
    }
}
