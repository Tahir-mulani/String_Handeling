/*Q6. WAP to input string and input second string and search second string in first input string using
indexOf() method?
Example: First String: Good Morning India
Second string: Morning
Output: String found */
import java.util.Scanner;
public class Search_String
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		System.out.println("Enter search String");
		String s2 = sc.next();
		
		
		if(searchString(s1,s2) >= 0)
		{
			System.out.println("String found");
		}
		else
		{
			System.out.println("String not found");
		}
		
	}
	public static int searchString(String s1,String s2)
	{
		  return s1.indexOf(s2);
	}
	
}