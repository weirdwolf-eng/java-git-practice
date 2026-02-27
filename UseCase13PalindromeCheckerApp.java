import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        long start1 = System.nanoTime();
        boolean result1 = checkUsingLoop(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Loop Result : " + result1 + " | Time : " + (end1 - start1) + " ns");
        System.out.println("Stack Result : " + result2 + " | Time : " + (end2 - start2) + " ns");
    }

    static boolean checkUsingLoop(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}