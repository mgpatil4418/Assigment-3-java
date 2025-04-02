public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return originalNum == reverse;
    }
}

