import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static ArrayList<String> findAbbr(String str) {
        ArrayList<String> ans = new ArrayList<>();
        solve(str, "", 0, str.length(), ans, -1);
        Collections.sort(ans);
        return ans;
    }

    private static void solve(String str, String temp, int ind, int n, ArrayList<String> ans, int las) {
        if (ind >= n) {
            if (n - las > 1) {
                temp += (n - las - 1);
            }
            ans.add(temp);
            return;
        }

        int flag = 0;
        int sz=0;

        if (ind - las > 1) {
            flag = 1;
            sz = String.valueOf(ind - las - 1).length();
            temp += (ind - las - 1);
        }

        temp += str.charAt(ind);
        solve(str, temp, ind + 1, n, ans, ind);
        temp = temp.substring(0, temp.length() - 1);

        if (flag == 1) {
            while (sz > 0) {
                temp = temp.substring(0, temp.length() - 1);
                sz--;
            }
        }

        solve(str, temp, ind + 1, n, ans, las);
    }
}
