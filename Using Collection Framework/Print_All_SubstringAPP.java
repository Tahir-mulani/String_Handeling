/*Q2. Write a Java program to find all substrings using Collection Framework.
Description: Print all substrings stored in ArrayList.
Input: Enter string: ABC
Output: A AB ABC B BC C */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Print_All_SubstringAPP
{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        
        // Using Collection Framework (ArrayList)
        List<String> substrings = printAllSubstring(str);
        
        // Print all substrings from collection
        System.out.println("\nAll Substrings:");
        for(String sub : substrings) {
            System.out.print(sub + " ");
        }
    }
    
    public static List<String> printAllSubstring(String str)
    {
        int n = str.length();
        
        // Create ArrayList to store all substrings
        List<String> substrings = new ArrayList<>();
        
        // Outer loop: starting position
        for(int i = 0; i < n; i++) {
            // Inner loop: ending position
            for(int j = i; j < n; j++) {
                // Build substring manually using charAt()
                String substring = "";
                for(int k = i; k <= j; k++) {
                    substring = substring + str.charAt(k);
                }
                // Add substring to collection
                substrings.add(substring);
            }
        }
        
        return substrings;
    }
}
