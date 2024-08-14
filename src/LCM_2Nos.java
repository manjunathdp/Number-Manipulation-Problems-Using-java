import java.util.Scanner;

public class LCM_2Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a=n1;
        int b=n2;
        int temp,lcm;
        while (b!=0) {
            temp=a%b;
            a=b;
            b=temp;
        }
        lcm=(n1*n2)/a;
        System.out.println("The LCM of number "+n1+" and "+n2+" is: "+lcm);

    }
}
