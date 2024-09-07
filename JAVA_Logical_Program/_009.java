package JAVA_Logical_Program;
import java.util.Scanner;
public class _009 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String S=(n%2==0)?("The number is even"):("The number is odd");
        System.out.println(S);
        sc.close();
    }
}
