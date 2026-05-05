/*Q1. WAP to input string and convert lower case string to upper case without using toUpperCase()
method?*/
import java.util.Scanner;
public class Convert_String_UpperCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z');
			{
				ch = (char) (ch-32); //convert to Upper case
				
			}
			result += ch;
		}
		System.out.println(result);
			
	}
}

