import java.util.*;
import java.lang.*;
import java.io.*;

class CalculateSqauresOnChessBoard {
    
  public static long ncrArr[][] = null;
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		int testCases[] = new int[tests];
	    for(int p=0;p<tests;p++){
	        testCases[p] = Integer.parseInt(br.readLine());
	    }
	    /*
	    int maxCase =0;
	    for(int val : testCases){
	        if(val > maxCase)
	            maxCase = val;
	    }
	    
	    ncrArr = new long[maxCase+2][maxCase+2];
	    for(int k=0;k<=maxCase+1;k++){
            for(int j=0;j<=maxCase+1;j++){
                ncrArr[k][j] = -1;
                if(k == j)
                    ncrArr[k][k] = 1;
                if(j == 1)
                    ncrArr[k][1] = k;
                if(j == 0)
                    ncrArr[k][0] = 1;
            }
	    }
	    */
	    for(int testNo = 0;testNo < tests;testNo++){
	        int n = testCases[testNo];
	        if(n == 1){
	            System.out.println("0");
	            continue;
	        }
	        //long total = ((n*n)*((n+1)*(n+1))) / 4;
	        long squares = n*(n+1)*(2*n+1) / 6;
	        long lineComb = ncr(n+1,2);
	        long rects = (lineComb * lineComb) - squares;
	        long rects = total - squares;
	        System.out.println(rects);
	    }
	}
	
	public static long ncr(int n, int r){
	    //Dynamic Programming approach to calculate ncr
        if(ncrArr[n][r] != -1)
            return ncrArr[n][r];
        
        for(int i=2;i<=n;i++){
            for(int j=i;j>1;j--){
                if(ncrArr[i][j] == -1)
                    ncrArr[i][j] = ncrArr[i-1][j] + ncrArr[i-1][j-1];
            }
        }
        /*
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(ncrArr[i][j]+" ");
            }
            System.out.println();
        }
        */
        return ncrArr[n][r];
        /* Recursive implementation for calculation ncr
        if(n==r) return 1;
        if(r==1) return n;
        if(r==0) return 1;
        
        return ncr(n-1,r) + ncr(n-1,r-1);
	    */
	}
	
}
