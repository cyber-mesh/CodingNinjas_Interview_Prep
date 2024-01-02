import java.util.HashSet;
public class solution {
	public static int FindFirstRepeatingDigit(String digitpattern) {
		HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<digitpattern.length();i++)
		{
            if(!set.contains(digitpattern.charAt(i)-'0'))
               set.add(digitpattern.charAt(i)-'0');
            else
                return digitpattern.charAt(i)-'0';
        }
		return -1;
	}
}
