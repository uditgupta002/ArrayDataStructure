import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
	    for(int p=0;p<tests;p++){
	        int size = Integer.parseInt(br.readLine().trim());
	        String vals[] = br.readLine().split(" ");
	        String vals2[] = br.readLine().split(" ");

	        int arrivals[] = new int[size];
	        int departures[] = new int[size];
	        int j = -1;
	        for(int i=0;i<vals.length;i++){
	            if(vals[i].trim().equals(""))
	                continue;
	            arrivals[++j] = Integer.parseInt(vals[i].trim());
	            
            }
            j = -1;
            for(int i=0;i<vals2.length;i++){
                if(vals2[i].trim().equals(""))
	                continue;
	            departures[++j] = Integer.parseInt(vals2[i].trim());
            }
            //System.out.println(arrivals.length);
            //System.out.println(departures.length);
            
            Arrays.sort(arrivals);
            Arrays.sort(departures);
            
            /*
            for(int i=0;i<size;i++){
                System.out.println(arrivals[i]+" "+departures[i]);
            }
            */
            
            int max = 1;
            int i = 1;
            int k = 0;
            int plat_needed = 1;
            while(i < size && k < size){
                if(arrivals[i] < departures[k]){
                    plat_needed++;
                    i++;
                    if(plat_needed > max)
                        max = plat_needed;
                } else {
                    plat_needed--;
                    k++;
                }
            }
            System.out.println(max);
	    }
    }
}
