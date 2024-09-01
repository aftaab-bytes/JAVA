import java.util.Scanner;
public class taking_input
{
    public static void main(String[]  args)
    {
        Scanner sc = new Scanner(System.in);//creating a scanner object
        System.out.print("Enter two numbers to add: ");
        int a = sc.nextInt(),b=sc.nextInt();//method to take input as integer
        System.out.print("Sum of two numbers is: ");
        System.out.printf("%d",(++a)+b);
        // boolean b1=
        // System.out.println(sc.hasNextInt());//checking function
    }
}
