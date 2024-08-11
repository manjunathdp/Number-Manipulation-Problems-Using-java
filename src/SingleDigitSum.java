import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int temp =n;
        int sum = 0;
        while (n!=0 || sum > 9)
        {
            if (n==0){
                n=sum;
                sum=0;
            }
            int last = n % 10;
            sum=sum+last;
            n /= 10;
        }
        System.out.println("The single-digit sum of digits of "+temp+" is "+sum);
    }
}
