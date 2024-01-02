
public class solution {

	public static long GetNewNum(long[] arr) {
		long num = 0;
        for (int pos=0; pos<=63; pos++) 
		{
            int zero=0, one=0;
            for (int i = 0; i < arr.length; i++) 
			{
                if ((arr[i] & 1L) == 1L) // Check if the rightmost bit is 1
                    one++;
                else
                    zero += (arr[i] > 0 || pos == 0) ? 1 : 0; // Convert boolean to integer
                arr[i] = arr[i] >> 1;
            }
            if (one > zero)
                num += (1L << pos);
        }
        return num;
	}
	
}

