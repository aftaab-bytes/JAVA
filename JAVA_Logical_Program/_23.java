package JAVA_Logical_Program;
import java.util.Scanner;
public class _23 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt(),a=0,b=1,sum=0;
        // 1 1 2 3 5 8 . . . . . 
        System.out.print("The Fibonacci series = 0 1 ");
        for(int i=1;i<=n-2;i++)
        {
            
            sum=a+b;
            a=b;
            b=sum;
            System.out.printf("%d ",sum);    
        }
        sc.close();
    }
}
