public class WaveSort{	
	//arr is the given array which you need to sort in a wave like pattern
	public static void swap(int[] arr, int a, int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void waveSort(int[] arr)
	{
		boolean f = true;
	    for (int i = 0; i < arr.length - 1; i++)
		{
        	if(f)
			{
	            if(arr[i] < arr[i+1])	
	                swap(arr, i, i+1);
        	}
	        else
			{
	            if(arr[i] > arr[i+1])
	                swap(arr, i, i+1);
        	}
	        f = !f;
	    }
	}
}
