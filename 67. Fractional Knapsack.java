import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static class PairCompare implements Comparator<Pair>
    {
        public int compare(Pair a, Pair b){
			if((double)b.value/b.weight > (double)a.value/a.weight) 
			    return 1;
			return -1;
        }
    }
    public static double maximumValue(Pair[] items, int n, int w) {
		PairCompare comp = new PairCompare();
        Arrays.sort(items,comp);
		double maxKnapsackValue = 0;
		for(Pair p : items){
			if(w==0) break;
			if(p.weight<=w){
				maxKnapsackValue+=p.value;
				w-=p.weight;
			}
			else{
				maxKnapsackValue = maxKnapsackValue+(w*(double)p.value/p.weight);
				break;
			}
		}
		return maxKnapsackValue;
	}
}
