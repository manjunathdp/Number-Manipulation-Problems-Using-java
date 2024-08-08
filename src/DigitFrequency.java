import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        sc.close();
        int lastdigit;
        int[] digit = new int[10];
        while (n>0){
            lastdigit=n%10;
            for (int i = 0; i < 10; i++) {
                if(i==lastdigit)
                    digit[i]++;
            }
            n=n/10;
        }
        for (int i = 0; i < 10; i++) {
            if(digit[i]!=0)
                System.out.println("Frequency of "+i+" is: "+digit[i]);
        }
    }
}
