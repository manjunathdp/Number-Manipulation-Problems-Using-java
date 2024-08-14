import java.util.Scanner;

public class ReverseNumber {
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
        System.out.println("The reverse of number "+temp+" is: "+rev);
    }
}
