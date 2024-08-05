import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        int first = 0,second=1;
        int third;

        if (n == 1) {
            System.out.print(first);
        } else {
            System.out.print(first + " " + second);
        }

        for (int i = 3; i <=n ; i++) {
            third =first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
        sc.close();
    }
}
