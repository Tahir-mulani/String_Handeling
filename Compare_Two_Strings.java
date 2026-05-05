//Q3. WAP to input two strings and compare then without using equals() or compareTo() method ?
import java.util.Scanner;
public class Compare_Two_Strings
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(checkIsEquals(s1,s2))
		{
			System.out.println("Both string are equals using equals()");
		}
		else
		{
			System.out.println("Both string are not equals using equals()");
		}
		if((checkComapreTo(s1,s2) > 0))
		{
			System.out.println("Both string are equals using compareTo()");
		}
		else
		{
			System.out.println("Both string are not equals using compareTo()");
		}
			
		
	}
	public static boolean checkIsEquals(String s1,String s2)
	{
		return s1.equals(s2);
	}
	public static int  checkComapreTo(String s1,String s2)
	{
		return s1.compareTo(s2);
	}
}