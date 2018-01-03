import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class ContigiousArrayCheck {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>(temp.length);
		for(int i=0;i<temp.length;i++){
		    arr.add(Integer.parseInt(temp[i]));
		}
		
		Set<Integer> set = new HashSet<Integer>(arr);
		int count = 0;
		int currentElement = arr.get(0);
		while(set.contains(currentElement)){
		    count++;
		    currentElement++;
		}
		currentElement = arr.get(0)-1;
		while(set.contains(currentElement)){
		    count++;
		    currentElement--;
		}
		if(count == set.size())
		    System.out.println("Contigious");
		else
		    System.out.println("Non-Contigious");
	}
}
