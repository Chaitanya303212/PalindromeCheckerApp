import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // Compare characters
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean result = isPalindromeRecursive(text, 0, text.length() - 1);

        if (result)
            System.out.println("It is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}