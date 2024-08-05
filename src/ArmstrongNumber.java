import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        long n=sc.nextLong();
        long temp=n;
        int lastDigit =0;
        long armstrong=0;
        double length=0;
        while (n>0)
        {
            n /= 10;
            length++;
        }
        n=temp;
        //length = String.valueOf(n).length();
        while (n>0) {
           lastDigit= (int)(n % 10);
           armstrong= (long) Math.pow(lastDigit,length)+armstrong;
           n /= 10;
        }
        if (armstrong == temp) {
            System.out.println("The number "+temp+" is an Armstrong Number");
        }
        else {
            System.out.println("The number "+temp+" is Not an Armstrong Number");
        }
    }
}
