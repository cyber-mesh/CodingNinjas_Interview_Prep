import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, n, i, a;
		x=sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> sorted = new ArrayList<ArrayList<Integer>>();
		for(a=1; a<=x; a++)
		{
			num.add(sc.nextInt());
			ArrayList<Integer> array = new ArrayList<Integer>();
			for(i=0; i<num.get(a-1); i++)
			{
				array.add(sc.nextInt());
			}
			Collections.sort(array);
			sorted.add(array);
		}
		for(i=0; i<sorted.size(); i++)
		{
			for(int j=0; j<num.get(i); j++)
				System.out.print(sorted.get(i).get(j)+" ");	
			System.out.println();
		}
	}

}
