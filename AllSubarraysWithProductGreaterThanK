import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	//Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long testCases = Long.parseLong(br.readLine());
    for(long testNo = 0 ;testNo < testCases; testNo++){
    String[] tempVals = br.readLine().split(" ");
    int size = Integer.parseInt(tempVals[0]);
    long k = Long.parseLong(tempVals[1]);
    
    String temp[] = null;
    long arr[] = new long[size];
    int n,count = 0;
    long product = 1;
    temp = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      arr[i] = Long.parseLong(temp[i]);
    }
    
    int i = 0;
    int j = 0;
      while(j<size){
        
        product *= arr[j];
        //System.out.print("Range is "+ i +" "+ j +" " + product);
        
        while(i < j && product >= k){
            product /= arr[i];
            i++;
        }
        
        if(product < k){
          count += (j-i+1);
        }
        j++;
      }
    System.out.println(count);        
    }
    }
}
