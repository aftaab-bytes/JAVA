package JAVA_Logical_Program;
public class _019
{
    public static void main(String[]args)
    {
        int n=28,sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)      
               sum+=i;
        
        if(sum==n)
            System.out.println("The number is a perfect number..");
        else
        System.out.println("The number is not a perfect number..");

    }
}