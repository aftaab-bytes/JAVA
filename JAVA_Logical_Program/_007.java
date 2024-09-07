package JAVA_Logical_Program;
class _007
{
    public static void main(String[] args)
    {
        int n=15,i,sum;
        for(sum=0,i=1;i<=n;sum+=i,i++);
        System.out.println("The sum of "+n+" Natural numbers is : "+sum);
    }
}