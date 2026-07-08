//check anagram strings
import java.util.Scanner;
public class CheckAnagramString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		System.out.println("Enter String");
		String s2 = sc.nextLine();

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean result = checkAnagram(s1,s2);
		if(result)
		{
			System.out.println("Anagram Strings");
		}
		else
		{
			System.out.println("Not Anagram Strings");
		}
	}
	public static boolean checkAnagram(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		boolean flag[] = new boolean[s2.length()];
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			boolean found = true; 
			for(int j=0;j<s2.length();j++)
			{
				if(!flag[i] && ch == s2.charAt(j))
				{
					flag[j] = true;
					found = true;
					break;
				}
			}
			if(!found)
			{
				return found;
			}
		}
		return true;
	}
}