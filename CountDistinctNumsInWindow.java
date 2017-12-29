class CountDistinctNumsInWindow
{
    void countDistinct(int A[], int k, int n)
    {
	    HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
	    int i=0;
	    int j=0;
	    int distinctCount = 0;
	    while(i < k){
	        if(countMap.get(A[i]) != null){
	            countMap.put(A[i],countMap.get(A[i])+1);
	        } else {
	            countMap.put(A[i],1);
	            distinctCount++;
	        }
	        i++;
	    }
	    System.out.print(distinctCount+" ");
	    for(;i<n;i++,j++){
	        if(countMap.get(A[j]) != null){
	            if(countMap.get(A[j]) == 1){
	                distinctCount--;
	                countMap.remove(A[j]);
	            } else {
	                countMap.put(A[j],countMap.get(A[j]) - 1);
	            }
	        }
	        if(countMap.get(A[i]) != null){
	            countMap.put(A[i],countMap.get(A[i])+1);
	        } else {
	            countMap.put(A[i],1);
	            distinctCount++;
	        }
	        System.out.print(distinctCount+" ");
	    }
    }
}
