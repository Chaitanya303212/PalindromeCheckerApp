import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Simple Two Pointer
    public static boolean twoPointerPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // Method 2: Stack
    public static boolean stackPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray())
            stack.push(c);

        for (char c : text.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    // Method 3: Deque
    public static boolean dequePalindrome(String text) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Two Pointer
        long start1 = System.nanoTime();
        boolean r1 = twoPointerPalindrome(text);
        long end1 = System.nanoTime();

        // Stack
        long start2 = System.nanoTime();
        boolean r2 = stackPalindrome(text);
        long end2 = System.nanoTime();

        // Deque
        long start3 = System.nanoTime();
        boolean r3 = dequePalindrome(text);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Two Pointer Result: " + r1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Result: " + r2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nDeque Result: " + r3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}