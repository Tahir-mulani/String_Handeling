//print duplicate character
import java.util.Scanner;
public class PrintDuplicateCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String result = "";
		
		
		boolean flag = true;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			// check ch already occured before position i
			boolean isSeen = false;
			for(int k=0;k<i;k++)
			{
				if(str.charAt(k) == ch)
				{
					isSeen = true;
					break;
				}
			}
			
			if(isSeen)
			{
				continue;
			}
			
			// check duplicate ch after position i
			for(int j=i+1;j<str.length();j++)
			{
				if(ch == str.charAt(j)){
					System.out.println(ch);
					flag = false;
					break;
				}
				 
			}
		}
		if(flag)
		{
			System.out.println("Thre is no duplicate character");
		}
	}
}
