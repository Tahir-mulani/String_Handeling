/*Q2. Write a Java program to find all substrings.
Description: Print all substrings.
Input: Enter string: ABC
Output: A AB ABC B BC C */
import java.util.Scanner;
public class Print_All_SubstringAPP
{
    public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        printAllSubstring(str);
    }
    public static void printAllSubstring(String str)
    {
        int n = str.length();
        
        // Outer loop: starting position
        for(int i = 0; i < n; i++)
		{
            // Inner loop: ending position
            for(int j = i; j < n; j++) 
			{
                // Extract and print substring manually
                // using charAt() to build each substring
                for(int k = i; k <= j; k++) 
				{
                    System.out.print(str.charAt(k));
                }
                System.out.print(" ");
            }
        }
    }
}