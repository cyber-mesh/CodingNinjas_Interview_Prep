import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main {
	public static void decodings(String s, int length)
	{
		int n=Integer.parseInt(s);
		int c=1;
		for(int i=n; i>0; i=i/10)
		{
			int d1=i%10;
			int d2=i%100;
			if(d2 == 0)
			{
				System.out.println(0);
				break;
			}
			if(i!=n && (d2==1 || d2==2) && d1<=6)
				c++;
		}
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for(int x=0; x<n; x++)
		{
			String s=sc.nextLine();
			arr.add(s);
			int len= s.length();
			decodings(s, len);
		}
	}

}
