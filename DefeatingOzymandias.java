import java.util.ArrayList;
public class Solution {
	static int c=0;
	public static ArrayList<ArrayList<Integer>> sol(Function f, int z)
	{
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		int Y=1000;
		for (int X = 1; X <= 1000; X++) {
            while (Y > 1 && f.f(X,Y) > z) {
                Y--;
            }
            if (f.f(X,Y) == z) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(X);
                pair.add(Y);
                arr.add(pair);
            }
        }
        return arr;
	}
}
