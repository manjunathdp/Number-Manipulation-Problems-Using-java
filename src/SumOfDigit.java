import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int sum = 0;
        int lastDigit;
        int n=sc.nextInt();
        int temp=n;
        while (n>0) {
            lastDigit=n%10;
            sum +=lastDigit;
            n /=10;
        }
        System.out.println("Sum of "+temp+" is: "+sum);
    }
}
