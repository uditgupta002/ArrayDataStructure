import java.util.*;
import java.lang.*;
import java.io.*;

class NthUglyNumber_NDP {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		for(int p=0;p<cases;p++){
		    int number = sc.nextInt();
		    int num = 1;
		    for(int i=1;i<number;){
		        List<Integer> factors = calculateFactors(++num);
		        
		        boolean isUgly = true;
		        for(int j=0;j<factors.size();j++){
		            if(!(factors.get(j) == 2 || factors.get(j) == 3 || factors.get(j) == 5)){
		                isUgly = false;
		                break;
		            }
		        }
		        //System.out.println("Factors of "+num+" are "+factors+" and "+num+" isUgly= "+isUgly);
		        if(isUgly)
		            i++;
		    }
		    System.out.println(num);
		    
		}
	}
	
	
	public static List<Integer> calculateFactors(int number){
	    
	    List<Integer> factors = new ArrayList<Integer>();
	    while(number%2 == 0){
	        factors.add(2);
	        number = number/2;
	    }
	    
	    for(int i=3;i<=Math.sqrt(number);i+=2){
	        if(number % i == 0){
	                factors.add(i);
	                number /= i;
	       }
	    }
	    if(number > 2)
	        factors.add(number);
	    
	    return factors;
	}
}
