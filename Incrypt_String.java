/*Q8. WAP to input string and incrypt like as?
Example: abcmnoabc
Output: a2b2c2m1n1o1*/
import java.util.Scanner;
public class Incrypt_String
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		incryptFormatString(str);
	}
	public static void incryptFormatString(String str)
	{
		StringBuilder result = new StringBuilder();
		boolean visited[] = new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(visited[ch])
			{
				continue;
			}
			int count = 0;
			
			for(int j=0;j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					count++;
				}
			}
			result.append(ch).append(count);
			visited[ch] = true;	
		}
		System.out.println(result);
				
				
	}
}