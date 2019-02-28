
public class SortingDemoOne {

	public static void main(String[] args) {
    int[] arr = {3,1,5,2,4};
    for (int i = 0; i < arr.length ; i++) 
    {
    	for (int j = 0; j < arr.length-1; j++) {
    	    int temp=0;
    		if (arr[j] > arr[j+1]) 
        	{
        		temp= arr[j];
        		arr[j]=arr[j+1];
        		arr[j+1]=temp;
        		
    			}
		}
    	
    	
    	/*i++;
    	else 
    	{
    	i++;
    	}*/
    }
for (int k = 0; k< arr.length; k++) {
	System.out.print(arr[k]+ " ");
}

}

}
