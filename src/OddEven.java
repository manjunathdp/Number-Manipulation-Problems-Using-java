import java.util.Scanner;

public class OddEven {
    static void oddeve(int n)
    {
        if(n!=0) {
            if (n % 2 == 0) {
                System.out.println("The number " + n + " is Even");
            } else {
                System.out.println("The number " + n + " is Odd");
            }
        }
        else {
            System.out.println("You have Entered " + n + " That is Neutral");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
            int n = sc.nextInt();
            oddeve(n);
    }
}
