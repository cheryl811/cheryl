import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        int number = 123121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        System.out.println("->"+System.currentTimeMillis());
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
