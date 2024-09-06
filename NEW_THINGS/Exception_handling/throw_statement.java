package Exception_handling;
import java.util.Scanner;
public class throw_statement {
    static void check_access(int age)
    {
        if(age<18)
        {throw new ArithmeticException("Access is denied for below 18 years....:(");}
    
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        check_access(x);
        sc.close();
    }
}
