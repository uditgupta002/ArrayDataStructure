class FindTripletsWith0Sum
{
	public boolean findTriplets(int arr[] , int n){
        Arrays.sort(arr);
            
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l < r){
                if(arr[i]+arr[l]+arr[r] == 0)
                    return true;
                else if(arr[i]+arr[l]+arr[r] > 0)
                    r--;
                else
                    l++;
            }
        }
        return false;
    }
}
