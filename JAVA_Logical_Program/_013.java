package JAVA_Logical_Program;
import java.util.Scanner;
public class _013 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int z=a>b?(a>c?a:c):(b>c?b:c);
        int y=a<b?(a<c?a:c):(b<c?b:c);
        System.out.printf("The maximum of %d,%d and %d = %d",a,b,c,z);
        System.out.printf("\nThe minimum of %d,%d and %d = %d",a,b,c,y);
        sc.close();
    }
}
