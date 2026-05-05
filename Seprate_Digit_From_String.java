/*Q4. WAP to input string and separate digit from string and calculate its sum?
Example: abc123mno456;
Output:1+2+3+4+5+6 =21 */
import java.util.Scanner;
public class Seprate_Digit_From_String
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		separateDigitFromString(str);
	}
	public static void separateDigitFromString(String str)
	{
		String result = "";
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9')
			{
				sum +=  Character.getNumericValue(ch);
				continue;
			}
			result += ch;
			
		}
		System.out.println("After Seprate Digit From String ->"+result);
		System.out.println("Sum "+sum);
				
	}
}