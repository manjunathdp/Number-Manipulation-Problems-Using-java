import java.util.Scanner;

public class NthFibonacciNumber {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        int fib = 0;  // Initialize fib here
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fib);

    }

}
