class Palindrome {
    void printPalindromes() {
        for (int i = 1; i <= 1000; i++) {
            int original = i;
            int reversed = 0;
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            if (original == reversed) {
                System.out.print(i + " ");
            }
        }
    }
}

class PalindromeCall {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.printPalindromes();
    }
}