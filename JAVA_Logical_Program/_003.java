package JAVA_Logical_Program;
import java.util.Scanner;
public class _003 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find the GCD : ");
        int rem,a=sc.nextInt(),b=sc.nextInt(),org=a,org1=b;
        while(b!=0)
        {
            rem = a%b;
            a=b;
            b=rem;
        }
        System.out.printf("The  GCD of %d and %d = %d",org,org1,a);
        sc.close();
    }
}
