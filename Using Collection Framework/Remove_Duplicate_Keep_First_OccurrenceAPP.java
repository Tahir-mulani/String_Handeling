import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Remove_Duplicate_Keep_First_OccurrenceAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		//using HashSet for uniqueness
		Set<Character> set = new HashSet<>();
		StringBuilder s = new StringBuilder();
		
		//traverse the string
		for(char ch : str.toCharArray())
		{
			if(!set.contains(ch))
			{
				set.add(ch);
				s.append(ch);
			}
		}
		System.out.println("output is :"+s);
	}
}
		