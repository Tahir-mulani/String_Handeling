//Q2. WAP to input string and reverse the string without using any inbuilt function?
import java.util.Scanner;
public class Reverse_String
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		StringBuilder result = new StringBuilder();
		//first approach
		for(int i=str.length()-1;i>=0;i--)
		{
			result.append(str.charAt(i));
		}
		System.out.println(result);
		
		/*second approach
		int right = str.length()-1;
		while(right >=0)
		{
			char ch = str.charAt(right);
			result.append(ch);
			right--;
		}
		System.out.println(result);*/
			
	}
}