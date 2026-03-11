import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeTwoPointer(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(text.charAt(left)) !=
                Character.toLowerCase(text.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (isPalindromeTwoPointer(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}