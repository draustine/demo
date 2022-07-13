// Java program to check three or
// more consecutive identical
// characters or numbers
// using regular expression
 

import java.util.regex.*;
import java.util.Scanner;

public class GFG {
 

    // Function to check three or

    // more consecutive identical

    // characters or numbers

    // using regular expression

    public static boolean isIdentical(String str) {

       
        // String regex = "^(?!.*([a-zA-Z0-9@#$%^&-+=()])\\1)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        String regex = "^[\\d]{11}$|^[\\d]{10}$";

        // Compile the ReGex

        Pattern p = Pattern.compile(regex);
 

        // If the string is empty

        // return false

        if (str == null) {

            return false;

        }
 

        // Find match between given string

        // and regular expression

        // using Pattern.matcher()

        Matcher m = p.matcher(str);
 

        // Return if the string

        // matched the ReGex

        return m.matches();

    }
 

    // Driver code

    public static void main(String args[])

    {
 
        String str = null;
        // Test until string == null
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string");
            str = input.nextLine();
            if (str == null) {
                break;
            }
            if (isIdentical(str)) {
                System.out.println("String is valid");
            } else {
                System.out.println("String is invalid");
            }
        }
        
        
    }
}