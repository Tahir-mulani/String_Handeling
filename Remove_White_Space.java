//Q7. WAP to input string and remove the white spaces from a string?
import java.util.Scanner;
public class Remove_White_Space
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		removeWhiteSpace(str);
		
		//using split() method
		removeWhiteSpaceUsingSpilit(str);
		
	}
	public static void removeWhiteSpace(String str)
	{
		String result ="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				continue;
			}
			result += str.charAt(i);
		}
		System.out.println("after removing white space without split() -> "+result);		
	}
	public static void removeWhiteSpaceUsingSpilit(String str)
	{
		String []val = str.split(" ");
		System.out.println("using split() ->");
		for(String s:val)
		{
			System.out.print(s);
		}
	}
}