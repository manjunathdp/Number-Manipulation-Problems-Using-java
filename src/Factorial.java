import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        int factorial=1;
        for (int i = 2; i <=n ; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of number "+n+" is: "+ factorial);
    }
}
