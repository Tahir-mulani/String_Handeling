/*Q9. WAP to input string and reverse word from a string?
Example: good morning india
Output: doog gninrom aidni */
import java.util.Scanner;
public class Reverse_Words
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		 
		reverseWords(str);
	}
	public static void reverseWords(String str)
	{
		String words[] = str.split(" ");
		String result = "";
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String rev = "";
			
			for(int j=words	[i].length()-1;j>=0;j--)
			{
				rev += word.charAt(j);
			}
			result += rev+" ";
		}
		System.out.println("Reversed Words: "+result.trim());		
	}
	
}