import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        int sqrt = (int) (Math.sqrt(n));
        if(Math.pow(sqrt,2)==n)
            System.out.println("perfect sqr no");
        else
            System.out.println("its not");
    }
}
