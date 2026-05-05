//Q5. WAP to input string and count the words from a string using split() method?
import java.util.Scanner;
public class Count_Words
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		int result = countWords(str);
		System.out.println(result);
	}
	public static int countWords(String str)
	{	
		String[] result = str.split(" ");
		 
		return result.length;
		
	}
}