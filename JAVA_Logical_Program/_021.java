package JAVA_Logical_Program;
public class _021
{
    public static void main(String[] args)
    {
        int n=7,z=0;
        for(int i=1;i<=n;i++)
        if(n%i==0)
        z++;
        if(z==2)
        System.out.println("The given number is a prime number...");
        else
        System.out.println("The given number is not a prime number...");

    }
}