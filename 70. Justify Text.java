import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


public class Solution {
    public static ArrayList<String> fullJustify(ArrayList<String> words, int maxWidth) {
        ArrayList<String> ans = new ArrayList<String>();

        int n = words.size();
        int count = 0;
        int spaces = 0;
        int extraSpaces = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (count + words.get(i).length() <= maxWidth) {
                count += words.get(i).length() + 1;
                spaces++;
            } else {
                spaces--;
                extraSpaces = maxWidth - count + 1;
                StringBuilder line = new StringBuilder();

                int eachSpace = 0;
                int extraLeft = 0;
                String oneWord = "";
                if (spaces > 0) {
                    eachSpace = extraSpaces / spaces;
                    extraLeft = extraSpaces % spaces;
                } else {
                    while (extraSpaces != 0) {
                        oneWord += " ";
                        extraSpaces--;
                    }
                }

                StringBuilder sp = new StringBuilder(" ");
                while (eachSpace != 0) {
                    sp.append(" ");
                    eachSpace--;
                }

                while (spaces != 0) {
                    line.append(words.get(j)).append(sp);
                    if (extraLeft > 0) {
                        line.append(" ");
                        extraLeft--;
                    }
                    j++;
                    spaces--;
                }
                line.append(words.get(j)).append(oneWord);

                j = i;
                i--;
                count = 0;
                spaces = 0;
                ans.add(line.toString());
            }
        }

        spaces--;
        extraSpaces = maxWidth - count + 1;
        StringBuilder line = new StringBuilder();
        while (spaces != 0) {
            line.append(words.get(j)).append(" ");
            j++;
            spaces--;
        }
        line.append(words.get(n - 1));
        while (extraSpaces != 0) {
            line.append(" ");
            extraSpaces--;
        }
        ans.add(line.toString());

        return ans;
    }
}
