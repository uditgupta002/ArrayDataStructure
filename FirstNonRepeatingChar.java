import java.util.*;
import java.lang.*;
import java.io.*;

class FirstNonRepeatingChar {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine().trim());
	    for(int p=0;p<tests;p++){
	        int size = Integer.parseInt(br.readLine().trim());
	        String vals = br.readLine();
            
            int temp[] = new int[26];
            for(int i=0;i<size;i++){
                temp[vals.charAt(i)%97]++;
            }
            
            Character found = null;
            
            for(int i=0;i<size;i++){
                if(temp[vals.charAt(i)%97] == 1){
                    found = vals.charAt(i);
                    break;
                }
            }
            
            if(found != null)
                System.out.println(found);
            else
                System.out.println(-1);
	    }
    }
}
