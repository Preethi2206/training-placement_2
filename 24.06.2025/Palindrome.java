public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (rev == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
