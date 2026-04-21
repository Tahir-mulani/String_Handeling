import java.util.Scanner;
public class Remove_Duplicate_Keep_First_OccurrenceAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		String result = removeDuplicateKeepFirstOccurrence(str);
		System.out.println(result);
	}
	public static String removeDuplicateKeepFirstOccurrence(String str)
	{
		String s = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(s.indexOf(ch) == -1)
			{
				s += ch;
			}
		}
		
		return s;
	}
}
		