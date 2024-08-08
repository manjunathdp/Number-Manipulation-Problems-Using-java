import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0)
                sum+=i;
        }
        if (sum==n)
            System.out.println("The given number "+n+" is a Perfect Number.");
        else
            System.out.println("The given number "+n+" is Not a Perfect Number.");
    }
}
