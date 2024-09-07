package JAVA_Logical_Program;
import java.util.Scanner;
class _011
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the l,b and h of triangle : ");
        int l=sc.nextInt(),b=sc.nextInt(),h=sc.nextInt();
        float ar = (l*b*h)/2f;
        System.out.println("The are of trianlge is : "+ar);
        sc.close();
    }
}