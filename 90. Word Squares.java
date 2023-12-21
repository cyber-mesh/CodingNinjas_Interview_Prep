import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<String>> wordSquares(ArrayList<String> arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        if (arr == null || arr.isEmpty()) {
            return result;
        }

        int squareLen = arr.get(0).length();
        HashMap<String, ArrayList<String>> prefixMap = new HashMap<>();
        buildPrefixMap(arr, prefixMap);

        ArrayList<String> current = new ArrayList<>();
        for (String word : arr) {
            current.add(word);
            search(squareLen, current, prefixMap, result);
            current.remove(current.size() - 1);
        }

        return result;
    }

    private static void buildPrefixMap(ArrayList<String> arr, HashMap<String, ArrayList<String>> prefixMap) {
        for (String word : arr) {
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                prefixMap.putIfAbsent(prefix, new ArrayList<>());
                prefixMap.get(prefix).add(word);
            }
        }
    }

    private static void search(int squareLen, ArrayList<String> current, HashMap<String, ArrayList<String>> prefixMap, ArrayList<ArrayList<String>> result) {
        if (current.size() == squareLen) {
            result.add(new ArrayList<>(current));
            return;
        }

        int idx = current.size();
        StringBuilder prefixBuilder = new StringBuilder();
        for (String word : current) {
            prefixBuilder.append(word.charAt(idx));
        }

        String prefix = prefixBuilder.toString();
        if (!prefixMap.containsKey(prefix)) {
            return;
        }

        for (String candidate : prefixMap.get(prefix)) {
            current.add(candidate);
            search(squareLen, current, prefixMap, result);
            current.remove(current.size() - 1);
        }
    }
}
