import java.util.Scanner;

public class GCD_2Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int atemp=a,btemp=b,temp;
        while (b!=0)
        {
            temp=a%b;
            a=b;
            b=temp;
        }
        System.out.println("GCD of "+atemp+" and "+btemp+" is: "+a);

    }
}
