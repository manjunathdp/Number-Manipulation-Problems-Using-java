import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        int rev=0;
        int lastDigit ,temp=n;
        while (n>0) {
            lastDigit = n % 10;
            rev = rev*10 + lastDigit;
            n /=10;
        }
        if (temp == rev) {
            System.out.println("The given number " + temp + " is a Palindrome Number");
        }
        else {
            System.out.println("The given number " + temp + " is Not a Palindrome Number because "+temp+" != "+rev);
        }
    }
}
