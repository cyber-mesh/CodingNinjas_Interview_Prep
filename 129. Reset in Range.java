
public class solution {
	
	public static long ResetAllBitsInRange(long num, int left, int right) {
		if (right < 0 || left >= Long.SIZE || right > left)
        	return num;
		long mask = ((1L << (left - right + 1)) - 1) << right-1;
		mask = ~mask;
		num &= mask;
		return num;
	}
}
