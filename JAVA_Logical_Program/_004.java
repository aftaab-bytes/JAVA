package JAVA_Logical_Program;
import java.util.Scanner;
public class _004
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number for finding LCM : ");
        int rem,a=sc.nextInt(),b=sc.nextInt(),org=a,org1=b;
        while(b!=0)
        {
            rem = a%b;
            a=b;
            b=rem;
        }
        System.out.printf("The LCM of %d and %d = %d",org,org1,(org1*org)/a);
        // based on the proof that LCM(a,b) = (a*b)/GCD(a,b)
        sc.close();
    }
}