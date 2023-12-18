public class solution {
	public static int distributeHats(int[] ar,int n,int m) {
		int ind=0;
		int hats[] = new int[n];
		boolean check=true;
		while(check)
		{
			check=false;
			for(int i=0; i<n; i++)
			{
				if(hats[i]<ar[i])
				{
					hats[i]+=m;
					ind=i+1;
					check=true;;
				}
			}
		}
		return ind;
	}
}
