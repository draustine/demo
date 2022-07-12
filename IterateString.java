import java.util.Scanner;

public class IterateString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(i + 1 < str.length()){
                if(str.charAt(i) == str.charAt(i + 1)){
                    System.out.println("Two consecutive characters are the same");
                    System.out.print(str.charAt(i) + " is the same as " + str.charAt(i + 1));
                    break;
                }
            }
        }
        input.close();
    }
}
    

