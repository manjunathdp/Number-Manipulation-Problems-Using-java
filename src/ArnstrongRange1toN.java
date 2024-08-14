import java.util.Scanner;

public class ArnstrongRange1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        long n=sc.nextLong();
        for (long i = 1; i <=n ; i++) {
            long temp = i;
            int lastDigit ;
            long armstrong = 0;
            double length = 0;
            while (i > 0) {
                i /= 10;
                length++;
            }
            i = temp;
            //length = String.valueOf(n).length();
            while (i > 0) {
                lastDigit = (int) (i % 10);
                armstrong = (long) Math.pow(lastDigit, length) + armstrong;
                i /= 10;
            }
            i=temp;
            if (armstrong == temp) {
                System.out.print(temp + " ");
            }
        }

    }
}
