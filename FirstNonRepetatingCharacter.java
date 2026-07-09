//first non-repeatating character
import java.util.Scanner;
public class FirstNonRepetatingCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			 int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println("The First Non Repetating "+ch);
				return;
			}
		}
		System.out.println("No non-repeating character found.");
		sc.close();
	}
}