import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String text = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        
        for(int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        String reversed = "";

         
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

         
        if(text.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}