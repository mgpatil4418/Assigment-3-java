public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitCount);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
