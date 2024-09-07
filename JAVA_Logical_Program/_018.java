package JAVA_Logical_Program;
public class _018 {
    public static void main(String[] args)
    {
        int n=1321,org=n,sum=0,d;
        while(org!=0)
        {
            d=org%10;
            sum=sum*10+d;
            org/=10;
        }
        if(sum==n)
        System.out.println("The given number is palindrome...");
        else
        System.out.println("The given number is not a palindrome...");
    }
}
