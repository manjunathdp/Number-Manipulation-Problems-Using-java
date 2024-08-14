import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        int count=0;
        if (n > 1) {
            for (int i = 2; i <n ; i++) {
                if (n % i==0) {
                    count++;
                }
            }
            if (count==0)
            {
                System.out.println("The given number "+ n + " is a prime number");
            }
            else {
                System.out.println("The given number "+ n + " is Not a Prime Number");
            }
        }
        else {
            System.out.println("The input value should be grater then 1");
        }
    }
}
