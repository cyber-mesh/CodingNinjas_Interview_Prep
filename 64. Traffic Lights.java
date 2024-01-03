import java.util.ArrayList;
public class Solution {
	private static int findNextGreater(int[] arr, int p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > p) return i;
        }
        return -1;
    }

    private static int findPrevSmaller(int[] arr, int p) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < p) return i;
        }
        return -1;
    }

    private static int insertPosition(int[] arr, int p) {
        int i = 0;
        while (arr[i] < p) {
            i++;
        }
        return i;
    }

    private static int findMaxDistance(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
	public static ArrayList<Integer> trafficLights(int n, int x, int[] pos) {
		int[] lights = new int[n + 2];
        int[] distance = new int[n + 1];

        lights[0] = 0;
        lights[n + 1] = x;
        distance[0] = x;

        ArrayList<Integer> res= new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int p = pos[i];

            int greaterPos = findNextGreater(lights, p);
            int smallerPos = findPrevSmaller(lights, p);

            distance[i + 1] = lights[greaterPos] - lights[smallerPos];

            lights[insertPosition(lights, p)] = p;

            int ans = findMaxDistance(distance, i + 1);
            res.add(ans);
        }

        return res;
	}
}

