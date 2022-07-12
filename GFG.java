// Java program to check three or
// more consecutive identical
// characters or numbers
// using regular expression
 

import java.util.regex.*;

public class GFG {
 

    // Function to check three or

    // more consecutive identical

    // characters or numbers

    // using regular expression

    public static boolean isIdentical(String str)

    {

        // Regex to check three or

        // more consecutive identical

        // characters or numbers

        //String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";

            // String regex = "\\b([a-zA-Z0-9])\\1+\\b";
            String regex = "^(?!.*([a-zA-Z0-9@#$%^&-+=()])\\1)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
            //String regex = "^(?!.*(\\d)\\1)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
 

        // Compile the ReGex

        Pattern p

            = Pattern.compile(regex);
 

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
 

        // Test Case 1:

        String str1 = "aSonauax#@";

        System.out.println(

            isIdentical(str1));
 

        // Test Case 2:

        String str2 = "xOun35yt#eda";

        System.out.println(

            isIdentical(str2));
 

        // Test Case 3:

        String str3 = "Zaonu3#";

        System.out.println(

            isIdentical(str3));
 

        // Test Case 4:

        String str4 = "abc";

        System.out.println(

            isIdentical(str4));
 

        // Test Case 5:

        String str5 = "aa";

        System.out.println(

            isIdentical(str5));

    }
}