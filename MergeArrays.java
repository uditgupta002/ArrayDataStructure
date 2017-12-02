import java.util.*;
import java.lang.*;
import java.io.*;

class MergeArrays {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
	    for(int p=0;p<tests;p++){
	        String size_vals[] = br.readLine().split(" ");
	        int size1 = Integer.parseInt(size_vals[0]);
	        int size2 = Integer.parseInt(size_vals[1]);
	        String vals1[] = br.readLine().split(" ");
	        String vals2[] = br.readLine().split(" ");
	        
	        int arr1[] = new int[size1];
	        int arr2[] = new int[size2];
	        for(int i=0;i<vals1.length;i++){
	            arr1[i] = Integer.parseInt(vals1[i]);
            }
            for(int i=0;i<vals2.length;i++){
	            arr2[i] = Integer.parseInt(vals2[i]);
            }
            
            int k = 0;
            int i = size1 - 1;
            int j = size2 - 1;
            int finalArr[] = new int[size1+size2];
            while(j >= 0 && i >= 0){
                if(arr1[i] > arr2[j]){
                    finalArr[k] = arr1[i];
                    i--;
                } else {
                    finalArr[k] = arr2[j];
                    j--;
                }
                k++;
            }
            
            while(j >= 0){
                finalArr[k] = arr2[j];
                j--;
                k++;
            }
            while(i >= 0){
                finalArr[k] = arr1[i];
                i--;
                k++;
            }
            
        for(int l=0;l<finalArr.length;l++){
	        System.out.print(finalArr[l]+" ");
	    }
	    System.out.println();
	    }
	    
	}
    }
