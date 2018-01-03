import java.util.*;
import java.lang.*;
import java.io.*;

class RelativeSorting {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int t=0;t<testCases;t++){
	        String temp[] = br.readLine().split(" ");
	        int M = Integer.parseInt(temp[0]);
	        int N = Integer.parseInt(temp[1]);
	        int arr1[] = new int[M];
	        int arr2[] = new int[N];
	        String temp1[] = br.readLine().split(" ");
	        String temp2[] = br.readLine().split(" ");
	        for(int i = 0; i < M; i++){
	            arr1[i] = Integer.parseInt(temp1[i]);
	        }
	        for(int j=0;j < N;j++){
	            arr2[j] = Integer.parseInt(temp2[j]);
	        }
	        int countArr[] = new int[1000];
	        for(int i=0;i<M;i++){
	            countArr[arr1[i]]++;
	        }
	        int finalArr[] = new int[M];
	        int k = 0;
	        for(int i = 0;i < N;i++){
	            if(countArr[arr2[i]] > 0){
	                for(int j=0;j < countArr[arr2[i]];j++)
	                    finalArr[k++] = arr2[i];
	                countArr[arr2[i]] = 0;
	            }
	        }
	        
	        int l = 0;
	        int tempArr[] = new int[M-k];
	        for(int i=0;i<countArr.length;i++){
	            if(countArr[i] > 0){
	                for(int j=0;j<countArr[i];j++){ 
	                    tempArr[l++] = i;
	                }
	            }
	        }
	        Arrays.sort(tempArr);
	        for(int i=0;i<tempArr.length;i++){
	            finalArr[k++] = tempArr[i];
	        }
	        for(int i=0;i<finalArr.length;i++){
	            System.out.print(finalArr[i]+" ");
	        }
	        System.out.println();
	    }
	}
}
