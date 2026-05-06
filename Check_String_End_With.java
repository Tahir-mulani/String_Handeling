//Q10 Write a Java program to check whether a given string ends with another string.
import java.util.Scanner;
public class Check_String_End_With
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter main String");
		String s1 = sc.nextLine();
		System.out.println("Enter end String");
		String s2 = sc.next();
		if(s1.endsWith(s2))
		{
			System.out.println("Given String end with ="+s2);
		}
		else
		{
			System.out.println("Given String not end with -> "+s2);
		}
			
	}
}
