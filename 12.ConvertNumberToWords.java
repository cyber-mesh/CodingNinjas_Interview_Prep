import java.util.* ;

import java.io.*; 

public class Solution {
    static String initials[] = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
    static String seconds[] = {"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    public static String convertDigitsUtil(int n, String s) {
        String str = "";
        if (n > 19)
            str += seconds[n / 10] + initials[n % 10];
        else
            str += initials[n];
        if (n != 0)
            str += s;
        return str;

    }
    public static String handleAll(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(convertDigitsUtil((int)(n / 10000000), "crore "));
        sb.append(convertDigitsUtil((int)((n / 100000) % 100), "lakh "));
        sb.append(convertDigitsUtil((int)((n / 1000) % 100), "thousand "));
        sb.append(convertDigitsUtil((int)((n / 100) % 10), "hundred "));

        if ((n > 100) && (n % 100 != 0))
            sb.append("and ");
        sb.append(convertDigitsUtil((int)(n % 100), ""));
        return sb.toString();

    }

}
